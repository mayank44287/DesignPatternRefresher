package LibraryManagementSystem;

ublic class Member extends User {
    private Date dateOfMembership;
    private int totalBooksCheckedOut;

    public boolean reserveBookItem(BookItem bookItem);
    private void incrementTotalBooksCheckedOut();
    public boolean checkoutBookItem(BookItem bookItem);
    private void checkForFine(String bookItemId);
    public void returnBookItem(BookItem bookItem);
    public boolean renewBookItem(BookItem bookItem);
    public boolean resetPassword() {
        // definition
    }
}