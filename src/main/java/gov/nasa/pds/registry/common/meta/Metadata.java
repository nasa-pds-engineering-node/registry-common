package gov.nasa.pds.registry.common.meta;

import java.util.Set;

import gov.nasa.pds.registry.common.util.FieldMapList;
import gov.nasa.pds.registry.common.util.FieldMapSet;


/**
 * Metadata extracted from PDS label.
 * 
 * @author karpenko
 */
public class Metadata
{
    public String lid;
    public String strVid;
    public float vid;
    public String lidvid;

    public String title;
    public String prodClass;
    
    public FieldMapSet intRefs;
    public FieldMapList fields;
    
    public Set<String> dataFiles;


    /**
     * Constructor
     */
    public Metadata()
    {
        intRefs = new FieldMapSet();
        fields = new FieldMapList();
    }
}
