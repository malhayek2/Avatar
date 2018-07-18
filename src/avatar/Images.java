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
public class Images 
{
    private String fileLocation;
    private int stackingOrder;
    
    public Images( String fL, int sO )
    {
        fileLocation = fL;
        stackingOrder = sO;
    }
    
    public Images()
    {
        fileLocation = "";
        stackingOrder = 0;
    }
    
    public void setFileLocation(String fL)
    {
        fileLocation = fL;
    }
    
    public String getFileLocation()
    {
        return fileLocation;
    }
    
    public void setStacking(int sO)
    {
        stackingOrder = sO;
    }
    
    public int getStacking()
    {
        return stackingOrder;
    }
}