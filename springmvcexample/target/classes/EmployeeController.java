
@Controller
@RequestMapping("/employee-module/addNew")
@SessionAttributes("employee")
public class EmployeeController 
{
  @Autowired
  EmployeeManager manager;
   
  @RequestMapping(method = RequestMethod.GET)
    public String setupForm(Model model) 
  {
     EmployeeVO employeeVO = new EmployeeVO();
     model.addAttribute("employee", employeeVO);
     return "addEmployee";
    }
   
  @RequestMapping(method = RequestMethod.POST)
    public String submitForm(@ModelAttribute("employee") EmployeeVO employeeVO,
                    BindingResult result, SessionStatus status) 
  {
    //Store the employee information in database
    //manager.createNewRecord(employeeVO);
     
    //Mark Session Complete
    status.setComplete();
    return "redirect:addNew/success";
    }
   
  @RequestMapping(value = "/success", method = RequestMethod.GET)
    public String success(Model model) 
  {
     return "addSuccess";
    }
}