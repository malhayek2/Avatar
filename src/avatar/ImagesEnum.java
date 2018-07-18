/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avatar;

/**
 *
 * @author Sara
 */
public enum ImagesEnum 
{///avatar/avatarBases/avatarBase04.png"
    BASE( "avatar\\images\\avatarBases\\avatarBase00.png", 0 ),
    EARS( "avatar\\images\\ears\\ears00.png" , 1 ),
    MOUTHS("avatar\\images\\mouths\\mouth00.png", 2 ),
    NOSES("avatar\\images\\noses\\nose00.png", 3 ),
    EYES("avatar\\images\\eyes\\eyes00.png", 4 ),
    HAIR("avatar\\images\\hair\\hair00.png", 5 ),
    SHIRTS("avatar\\images\\shirts\\shirt00.png", 6 ),
    ACCESSORIES("avatar\\images\\accessories\\necklace00.png", 7 );

    String fileLocation;
    int sortingOrder;
    
    private ImagesEnum(String fL, int sO)
    {
        fileLocation = fL;
        sortingOrder = sO;
    }
    
    public int getStacking()
    {
        return sortingOrder;
    }
    
    public String getFileLocation()
    {
        return fileLocation;
    }
    
    public void setStacking( int sO )
    {
        sortingOrder = sO;
    }
    
    public void setFileLocation( String fL )
    {
        fileLocation = fL;
    }
}