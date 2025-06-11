public class Customer {
    private String customerId;
    private String name;
    private String contact;
    private String email;
    private String preferredBranch;

    public Customer(String customerId,String name,String contact,String email,String preferredBranch){

        this.customerId = customerId;
        this.name=name;
        this.contact=contact;
        this.email=email;
        this.preferredBranch=preferredBranch;
        
    }
    
    public String getCustomerId(){
        return customerId;
    }
    public String getName(){
        return name;
    }
    public void updateContact(String newContact){
        this.contact=newContact;
    }

    public String getCustomerDetails(){
        return String.format(
            "Customer ID: %s\nName: %s\nContact: %s\nEmail: %s\nPreferred Branch: %s",customerId,name,contact,email,preferredBranch);
    }
    }

    