
package com.af.prud.model.epos;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "requireDiabetesDetails",
    "requireRespiratoryDetails",
    "height",
    "weight",
    "weightLoss",
    "treatmentOrMedication",
    "hospital",
    "xRayEcgBloodTest",
    "observationDiagnosisOperationTreatment",
    "aidsOrAdisRelated",
    "std",
    "positiveToAidsAntibodies",
    "abnormalityDeformityDiseaseOrDisorder",
    "treatmentOrMedicationExperience",
    "brainOrNervousDiseaseDisorder",
    "respiratoryDiseaseOrDisorder",
    "highBloodPressure",
    "heartOrCirculatoryDisease",
    "stomachIntestinesBowelRectumAppendixLiverGallBladderDiseaseDisorder",
    "kidneyBladderProstateDiseaseDisorder",
    "diabetes",
    "thyroidOrOtherEndocrineDisorder",
    "backSpineBonesJointsMusclesDiseaseOrDisorder",
    "cancerTumorUlcerOrAbnormalTissueGrowth",
    "varicosePhlebitisHernia",
    "eyesEarsNoseThroatDiseaseDisorder",
    "anySeriousIllnessInJurySurgeryNotMentioned"
})
public class Medical {

    @JsonProperty("requireDiabetesDetails")
    private Object requireDiabetesDetails;
    @JsonProperty("requireRespiratoryDetails")
    private Object requireRespiratoryDetails;
    @JsonProperty("height")
    private String height;
    @JsonProperty("weight")
    private Integer weight;
    @JsonProperty("weightLoss")
    private Boolean weightLoss;
    @JsonProperty("treatmentOrMedication")
    private Boolean treatmentOrMedication;
    @JsonProperty("hospital")
    private Boolean hospital;
    @JsonProperty("xRayEcgBloodTest")
    private Boolean xRayEcgBloodTest;
    @JsonProperty("observationDiagnosisOperationTreatment")
    private Boolean observationDiagnosisOperationTreatment;
    @JsonProperty("aidsOrAdisRelated")
    private Boolean aidsOrAdisRelated;
    @JsonProperty("std")
    private Boolean std;
    @JsonProperty("positiveToAidsAntibodies")
    private Boolean positiveToAidsAntibodies;
    @JsonProperty("abnormalityDeformityDiseaseOrDisorder")
    private Boolean abnormalityDeformityDiseaseOrDisorder;
    @JsonProperty("treatmentOrMedicationExperience")
    private Boolean treatmentOrMedicationExperience;
    @JsonProperty("brainOrNervousDiseaseDisorder")
    private Boolean brainOrNervousDiseaseDisorder;
    @JsonProperty("respiratoryDiseaseOrDisorder")
    private Boolean respiratoryDiseaseOrDisorder;
    @JsonProperty("highBloodPressure")
    private Boolean highBloodPressure;
    @JsonProperty("heartOrCirculatoryDisease")
    private Boolean heartOrCirculatoryDisease;
    @JsonProperty("stomachIntestinesBowelRectumAppendixLiverGallBladderDiseaseDisorder")
    private Boolean stomachIntestinesBowelRectumAppendixLiverGallBladderDiseaseDisorder;
    @JsonProperty("kidneyBladderProstateDiseaseDisorder")
    private Boolean kidneyBladderProstateDiseaseDisorder;
    @JsonProperty("diabetes")
    private Boolean diabetes;
    @JsonProperty("thyroidOrOtherEndocrineDisorder")
    private Boolean thyroidOrOtherEndocrineDisorder;
    @JsonProperty("backSpineBonesJointsMusclesDiseaseOrDisorder")
    private Boolean backSpineBonesJointsMusclesDiseaseOrDisorder;
    @JsonProperty("cancerTumorUlcerOrAbnormalTissueGrowth")
    private Boolean cancerTumorUlcerOrAbnormalTissueGrowth;
    @JsonProperty("varicosePhlebitisHernia")
    private Boolean varicosePhlebitisHernia;
    @JsonProperty("eyesEarsNoseThroatDiseaseDisorder")
    private Boolean eyesEarsNoseThroatDiseaseDisorder;
    @JsonProperty("anySeriousIllnessInJurySurgeryNotMentioned")
    private Boolean anySeriousIllnessInJurySurgeryNotMentioned;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("requireDiabetesDetails")
    public Object getRequireDiabetesDetails() {
        return requireDiabetesDetails;
    }

    @JsonProperty("requireDiabetesDetails")
    public void setRequireDiabetesDetails(Object requireDiabetesDetails) {
        this.requireDiabetesDetails = requireDiabetesDetails;
    }

    @JsonProperty("requireRespiratoryDetails")
    public Object getRequireRespiratoryDetails() {
        return requireRespiratoryDetails;
    }

    @JsonProperty("requireRespiratoryDetails")
    public void setRequireRespiratoryDetails(Object requireRespiratoryDetails) {
        this.requireRespiratoryDetails = requireRespiratoryDetails;
    }

    @JsonProperty("height")
    public String getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(String height) {
        this.height = height;
    }

    @JsonProperty("weight")
    public Integer getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @JsonProperty("weightLoss")
    public Boolean getWeightLoss() {
        return weightLoss;
    }

    @JsonProperty("weightLoss")
    public void setWeightLoss(Boolean weightLoss) {
        this.weightLoss = weightLoss;
    }

    @JsonProperty("treatmentOrMedication")
    public Boolean getTreatmentOrMedication() {
        return treatmentOrMedication;
    }

    @JsonProperty("treatmentOrMedication")
    public void setTreatmentOrMedication(Boolean treatmentOrMedication) {
        this.treatmentOrMedication = treatmentOrMedication;
    }

    @JsonProperty("hospital")
    public Boolean getHospital() {
        return hospital;
    }

    @JsonProperty("hospital")
    public void setHospital(Boolean hospital) {
        this.hospital = hospital;
    }

    @JsonProperty("xRayEcgBloodTest")
    public Boolean getXRayEcgBloodTest() {
        return xRayEcgBloodTest;
    }

    @JsonProperty("xRayEcgBloodTest")
    public void setXRayEcgBloodTest(Boolean xRayEcgBloodTest) {
        this.xRayEcgBloodTest = xRayEcgBloodTest;
    }

    @JsonProperty("observationDiagnosisOperationTreatment")
    public Boolean getObservationDiagnosisOperationTreatment() {
        return observationDiagnosisOperationTreatment;
    }

    @JsonProperty("observationDiagnosisOperationTreatment")
    public void setObservationDiagnosisOperationTreatment(Boolean observationDiagnosisOperationTreatment) {
        this.observationDiagnosisOperationTreatment = observationDiagnosisOperationTreatment;
    }

    @JsonProperty("aidsOrAdisRelated")
    public Boolean getAidsOrAdisRelated() {
        return aidsOrAdisRelated;
    }

    @JsonProperty("aidsOrAdisRelated")
    public void setAidsOrAdisRelated(Boolean aidsOrAdisRelated) {
        this.aidsOrAdisRelated = aidsOrAdisRelated;
    }

    @JsonProperty("std")
    public Boolean getStd() {
        return std;
    }

    @JsonProperty("std")
    public void setStd(Boolean std) {
        this.std = std;
    }

    @JsonProperty("positiveToAidsAntibodies")
    public Boolean getPositiveToAidsAntibodies() {
        return positiveToAidsAntibodies;
    }

    @JsonProperty("positiveToAidsAntibodies")
    public void setPositiveToAidsAntibodies(Boolean positiveToAidsAntibodies) {
        this.positiveToAidsAntibodies = positiveToAidsAntibodies;
    }

    @JsonProperty("abnormalityDeformityDiseaseOrDisorder")
    public Boolean getAbnormalityDeformityDiseaseOrDisorder() {
        return abnormalityDeformityDiseaseOrDisorder;
    }

    @JsonProperty("abnormalityDeformityDiseaseOrDisorder")
    public void setAbnormalityDeformityDiseaseOrDisorder(Boolean abnormalityDeformityDiseaseOrDisorder) {
        this.abnormalityDeformityDiseaseOrDisorder = abnormalityDeformityDiseaseOrDisorder;
    }

    @JsonProperty("treatmentOrMedicationExperience")
    public Boolean getTreatmentOrMedicationExperience() {
        return treatmentOrMedicationExperience;
    }

    @JsonProperty("treatmentOrMedicationExperience")
    public void setTreatmentOrMedicationExperience(Boolean treatmentOrMedicationExperience) {
        this.treatmentOrMedicationExperience = treatmentOrMedicationExperience;
    }

    @JsonProperty("brainOrNervousDiseaseDisorder")
    public Boolean getBrainOrNervousDiseaseDisorder() {
        return brainOrNervousDiseaseDisorder;
    }

    @JsonProperty("brainOrNervousDiseaseDisorder")
    public void setBrainOrNervousDiseaseDisorder(Boolean brainOrNervousDiseaseDisorder) {
        this.brainOrNervousDiseaseDisorder = brainOrNervousDiseaseDisorder;
    }

    @JsonProperty("respiratoryDiseaseOrDisorder")
    public Boolean getRespiratoryDiseaseOrDisorder() {
        return respiratoryDiseaseOrDisorder;
    }

    @JsonProperty("respiratoryDiseaseOrDisorder")
    public void setRespiratoryDiseaseOrDisorder(Boolean respiratoryDiseaseOrDisorder) {
        this.respiratoryDiseaseOrDisorder = respiratoryDiseaseOrDisorder;
    }

    @JsonProperty("highBloodPressure")
    public Boolean getHighBloodPressure() {
        return highBloodPressure;
    }

    @JsonProperty("highBloodPressure")
    public void setHighBloodPressure(Boolean highBloodPressure) {
        this.highBloodPressure = highBloodPressure;
    }

    @JsonProperty("heartOrCirculatoryDisease")
    public Boolean getHeartOrCirculatoryDisease() {
        return heartOrCirculatoryDisease;
    }

    @JsonProperty("heartOrCirculatoryDisease")
    public void setHeartOrCirculatoryDisease(Boolean heartOrCirculatoryDisease) {
        this.heartOrCirculatoryDisease = heartOrCirculatoryDisease;
    }

    @JsonProperty("stomachIntestinesBowelRectumAppendixLiverGallBladderDiseaseDisorder")
    public Boolean getStomachIntestinesBowelRectumAppendixLiverGallBladderDiseaseDisorder() {
        return stomachIntestinesBowelRectumAppendixLiverGallBladderDiseaseDisorder;
    }

    @JsonProperty("stomachIntestinesBowelRectumAppendixLiverGallBladderDiseaseDisorder")
    public void setStomachIntestinesBowelRectumAppendixLiverGallBladderDiseaseDisorder(Boolean stomachIntestinesBowelRectumAppendixLiverGallBladderDiseaseDisorder) {
        this.stomachIntestinesBowelRectumAppendixLiverGallBladderDiseaseDisorder = stomachIntestinesBowelRectumAppendixLiverGallBladderDiseaseDisorder;
    }

    @JsonProperty("kidneyBladderProstateDiseaseDisorder")
    public Boolean getKidneyBladderProstateDiseaseDisorder() {
        return kidneyBladderProstateDiseaseDisorder;
    }

    @JsonProperty("kidneyBladderProstateDiseaseDisorder")
    public void setKidneyBladderProstateDiseaseDisorder(Boolean kidneyBladderProstateDiseaseDisorder) {
        this.kidneyBladderProstateDiseaseDisorder = kidneyBladderProstateDiseaseDisorder;
    }

    @JsonProperty("diabetes")
    public Boolean getDiabetes() {
        return diabetes;
    }

    @JsonProperty("diabetes")
    public void setDiabetes(Boolean diabetes) {
        this.diabetes = diabetes;
    }

    @JsonProperty("thyroidOrOtherEndocrineDisorder")
    public Boolean getThyroidOrOtherEndocrineDisorder() {
        return thyroidOrOtherEndocrineDisorder;
    }

    @JsonProperty("thyroidOrOtherEndocrineDisorder")
    public void setThyroidOrOtherEndocrineDisorder(Boolean thyroidOrOtherEndocrineDisorder) {
        this.thyroidOrOtherEndocrineDisorder = thyroidOrOtherEndocrineDisorder;
    }

    @JsonProperty("backSpineBonesJointsMusclesDiseaseOrDisorder")
    public Boolean getBackSpineBonesJointsMusclesDiseaseOrDisorder() {
        return backSpineBonesJointsMusclesDiseaseOrDisorder;
    }

    @JsonProperty("backSpineBonesJointsMusclesDiseaseOrDisorder")
    public void setBackSpineBonesJointsMusclesDiseaseOrDisorder(Boolean backSpineBonesJointsMusclesDiseaseOrDisorder) {
        this.backSpineBonesJointsMusclesDiseaseOrDisorder = backSpineBonesJointsMusclesDiseaseOrDisorder;
    }

    @JsonProperty("cancerTumorUlcerOrAbnormalTissueGrowth")
    public Boolean getCancerTumorUlcerOrAbnormalTissueGrowth() {
        return cancerTumorUlcerOrAbnormalTissueGrowth;
    }

    @JsonProperty("cancerTumorUlcerOrAbnormalTissueGrowth")
    public void setCancerTumorUlcerOrAbnormalTissueGrowth(Boolean cancerTumorUlcerOrAbnormalTissueGrowth) {
        this.cancerTumorUlcerOrAbnormalTissueGrowth = cancerTumorUlcerOrAbnormalTissueGrowth;
    }

    @JsonProperty("varicosePhlebitisHernia")
    public Boolean getVaricosePhlebitisHernia() {
        return varicosePhlebitisHernia;
    }

    @JsonProperty("varicosePhlebitisHernia")
    public void setVaricosePhlebitisHernia(Boolean varicosePhlebitisHernia) {
        this.varicosePhlebitisHernia = varicosePhlebitisHernia;
    }

    @JsonProperty("eyesEarsNoseThroatDiseaseDisorder")
    public Boolean getEyesEarsNoseThroatDiseaseDisorder() {
        return eyesEarsNoseThroatDiseaseDisorder;
    }

    @JsonProperty("eyesEarsNoseThroatDiseaseDisorder")
    public void setEyesEarsNoseThroatDiseaseDisorder(Boolean eyesEarsNoseThroatDiseaseDisorder) {
        this.eyesEarsNoseThroatDiseaseDisorder = eyesEarsNoseThroatDiseaseDisorder;
    }

    @JsonProperty("anySeriousIllnessInJurySurgeryNotMentioned")
    public Boolean getAnySeriousIllnessInJurySurgeryNotMentioned() {
        return anySeriousIllnessInJurySurgeryNotMentioned;
    }

    @JsonProperty("anySeriousIllnessInJurySurgeryNotMentioned")
    public void setAnySeriousIllnessInJurySurgeryNotMentioned(Boolean anySeriousIllnessInJurySurgeryNotMentioned) {
        this.anySeriousIllnessInJurySurgeryNotMentioned = anySeriousIllnessInJurySurgeryNotMentioned;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
