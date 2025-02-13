package gov.nasa.pds.registry.common.meta;

import java.time.Instant;
import java.time.format.DateTimeFormatter;
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
    public static final String FLD_ALTERNATE_IDS = "alternate_ids";
    public static final String FLD_NODE_NAME = "ops:Harvest_Info/ops:node_name";
    public static final String FLD_HARVEST_DATE_TIME = "ops:Harvest_Info/ops:harvest_date_time";    
    public static final String FLD_ARCHIVE_STATUS = "ops:Tracking_Meta/ops:archive_status";


    public String lid;
    public String strVid;           // Original VID from XML
    public float vid;               // Float for sorting (fining the latest version)
    public String lidvid;

    public String title;
    public String prodClass;        // Label's root element, e.g., "Product_Observational"
    
    public FieldMapSet intRefs;     // Internal references (preprocessed)
    public FieldMapList fields;     // Metadata fields
    
    public Set<String> dataFiles;   // File names from <File_Area...> tags


    /**
     * Constructor
     */
    public Metadata()
    {
        intRefs = new FieldMapSet();
        fields = new FieldMapList();
    }
    

    /**
     * Set node name
     * @param name node name
     */
    public void setNodeName(String name)
    {
        fields.setValue(FLD_NODE_NAME, name);
    }
    
    
    /**
     * Set harvest timestamp
     * @param val timestamp
     */
    public void setHarvestTimestamp(Instant val)
    {
        String strVal = DateTimeFormatter.ISO_INSTANT.format(val);
        fields.setValue(FLD_HARVEST_DATE_TIME, strVal);
    }


    /**
     * Set archive status
     * @param status archive status
     */
    public void setArchiveStatus(String status)
    {
        fields.setValue(FLD_ARCHIVE_STATUS, status);
    }

}
