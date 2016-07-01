package dataStruct;

/**
 * Created by anukul on 12/10/15.
 */
//@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
//@XmlRootElement
public class plotInfo {

    private String plotName;
    private String plotAddr;
    private String plotType;
    private String plotYear1;
    private String plotYear2;
    private String plotSize;
    private String plotTreeAll;
    private String plotTreeDead;
    private String plotTreeRe;
    private String plotHowtoDead;
    private String plotOwnnerName;
    private String plotOwnnerAddr;
    private String plotOwnnerTel;
    private String plotAnno;

    public plotInfo() {

    }


    public String getPlotName() {
        return plotName;
    }

    //@XmlElement
    public void setPlotName( String plotName ) {
        this.plotName = plotName;
    }

    public String getPlotAddr() {
        return plotAddr;
    }

    //@XmlElement
    public void setPlotAddr( String plotAddr ) {
        this.plotAddr = plotAddr;
    }

    public String getPlotType() {
        return plotType;
    }

    //@XmlElement
    public void setPlotType( String plotType ) {
        this.plotType = plotType;
    }


    public String getPlotSize() {
        return plotSize;
    }

    //@XmlElement
    public void setPlotSize( String plotSize ) {
        this.plotSize = plotSize;
    }

    public String getPlotTreeAll() {
        return plotTreeAll;
    }

    //@XmlElement
    public void setPlotTreeAll( String plotTreeAll ) {
        this.plotTreeAll = plotTreeAll;
    }

    public String getPlotTreeDead() {
        return plotTreeDead;
    }

    //@XmlElement
    public void setPlotTreeDead( String plotTreeDead ) {
        this.plotTreeDead = plotTreeDead;
    }

    public String getPlotTreeRe() {
        return plotTreeRe;
    }

    //@XmlElement
    public void setPlotTreeRe( String plotTreeRe ) {
        this.plotTreeRe = plotTreeRe;
    }

    public String getPlotHowtoDead() {
        return plotHowtoDead;
    }

    //@XmlElement
    public void setPlotHowtoDead( String plotHowtoDead ) {
        this.plotHowtoDead = plotHowtoDead;
    }

    public String getPlotOwnnerName() {
        return plotOwnnerName;
    }

    //@XmlElement
    public void setPlotOwnnerName( String plotOwnnerName ) {
        this.plotOwnnerName = plotOwnnerName;
    }

    public String getPlotOwnnerAddr() {
        return plotOwnnerAddr;
    }

    //@XmlElement
    public void setPlotOwnnerAddr( String plotOwnnerAddr ) {
        this.plotOwnnerAddr = plotOwnnerAddr;
    }

    public String getPlotOwnnerTel() {
        return plotOwnnerTel;
    }

    //@XmlElement
    public void setPlotOwnnerTel( String plotOwnnerTel ) {
        this.plotOwnnerTel = plotOwnnerTel;
    }

    public String getPlotAnno() {
        return plotAnno;
    }

    //@XmlElement
    public void setPlotAnno( String plotAnno ) {
        this.plotAnno = plotAnno;
    }

    public String getPlotYear1() {
        return plotYear1;
    }

    public void setPlotYear1( String plotYear1 ) {
        this.plotYear1 = plotYear1;
    }

    public String getPlotYear2() {
        return plotYear2;
    }

    public void setPlotYear2( String plotYear2 ) {
        this.plotYear2 = plotYear2;
    }


}
