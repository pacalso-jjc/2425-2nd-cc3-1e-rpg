class Action {
    String name;

    public Action(String name) {
        this.name = name;
    }

    public void execute() {
        System.out.println("Performing action: " + name);
    }
}
