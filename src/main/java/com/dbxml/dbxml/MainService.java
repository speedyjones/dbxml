package com.dbxml.dbxml;

import com.dbxml.dbxml.domains.dao.LadDao;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class MainService {

    private final MainRepo mainRepo;


    public String getXmlData(List<LadDao> ladDao) throws IOException {


        try {
            FileWriter writer = new FileWriter("/media/veer/New Volume/Data/Java/Intellij Projects/java_8/db_to_xml/data.xml");
            writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
            writer.write("<CONSUMER>\n");

            for (LadDao writeLad : ladDao) {
                writer.write("\t<LAD>\n");
                writer.write("\t\t<RT>" + writeLad.getRT() + "</RT>\n");
                writer.write("\t\t<VN>" + writeLad.getVN() + "</VN>\n");
                writer.write("\t\t<AN>" + writeLad.getAN() + "</AN>\n");
                writer.write("\t\t<NAH>" + writeLad.getNAH() + "</NAH>\n");
                writer.write("\t\t<RSTAT>" + writeLad.getRSTAT() + "</RSTAT>\n");
                writer.write("\t\t<RSTAN>" + writeLad.getRSTAN() + "</RSTAN>\n");
                writer.write("\t\t<RSDT>" + writeLad.getRSDT() + "</RSDT>\n");
                writer.write("\t\t<AOD>" + writeLad.getAOD() + "</AOD>\n");
                writer.write("\t\t<CC>" + writeLad.getCC() + "</CC>\n");
                writer.write("\t\t<FA>" + writeLad.getFA() + "</FA>\n");
                writer.write("\t\t<AL>" + writeLad.getAL() + "</AL>\n");
                writer.write("\t\t<PF>" + writeLad.getPF() + "</PF>\n");
                writer.write("\t\t<PA>" + writeLad.getPA() + "</PA>\n");
                writer.write("\t\t<CL>" + writeLad.getCL() + "</CL>\n");
////                writer.write("\t\t<AS>" + writeLad.getAS() + "</AS>\n");
                writer.write("\t\t<BPA>" + writeLad.getBPA() + "</BPA>\n");
                writer.write("\t\t<BPD>" + writeLad.getBPD() + "</BPD>\n");
                writer.write("\t\t<OB>" + writeLad.getOB() + "</OB>\n");
                writer.write("\t\t<OA>" + writeLad.getOA() + "</OA>\n");
                writer.write("\t\t<NOP>" + writeLad.getNOP() + "</NOP>\n");
                writer.write("\t\t<LPA>" + writeLad.getLPA() + "</LPA>\n");
                writer.write("\t\t<LPD>" + writeLad.getLPD() + "</LPD>\n");
                writer.write("\t\t<ACD>" + writeLad.getACD() + "</ACD>\n");
                writer.write("\t\t<LID>" + writeLad.getLID() + "</LID>\n");
                writer.write("\t\t<LOD>" + writeLad.getLOD() + "</LOD>\n");
                writer.write("\t\t<WOD>" + writeLad.getWOD() + "</WOD>\n");
                writer.write("\t\t<WOA>" + writeLad.getWOA() + "</WOA>\n");
                writer.write("\t\t<CRC>" + writeLad.getCRC() + "</CRC>\n");
                writer.write("\t\t<ASPS>" + writeLad.getASPS() + "</ASPS>\n");
                writer.write("\t\t<FMPD>" + writeLad.getFMPD() + "</FMPD>\n");
                writer.write("\t\t<LMPD>" + writeLad.getLMPD() + "</LMPD>\n");
                writer.write("\t\t<PTD>" + writeLad.getPTD() + "</PTD>\n");
                writer.write("\t\t<AST>" + writeLad.getAST() + "</AST>\n");
                writer.write("\t\t<ASA>" + writeLad.getASA() + "</ASA>\n");
                writer.write("\t\t<PM>" + writeLad.getPM() + "</PM>\n");
                writer.write("\t</LAD>\n");
            }
//
            writer.write("</CONSUMER>");
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return "null";
    }


    public String encryptFile(String data) {
        String msg = "";
        try {
            byte[] publicKeyBytes = Base64.getDecoder().decode(ConstantFields.base64PublicKey.getBytes());
            X509EncodedKeySpec keySpec = new X509EncodedKeySpec(publicKeyBytes);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            PublicKey publicKey = keyFactory.generatePublic(keySpec);

            byte[] dataBytes = data.getBytes(StandardCharsets.UTF_8);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(Cipher.ENCRYPT_MODE, publicKey);
            byte[] encryptData = cipher.doFinal(dataBytes);

            msg = Base64.getEncoder().encodeToString(encryptData);

        } catch (NoSuchAlgorithmException | NoSuchPaddingException
                | IllegalBlockSizeException | BadPaddingException | InvalidKeyException
                | InvalidKeySpecException e) {
            msg = e.getMessage();
        }

        return msg;

    }

    public String decryptFile(String data) {
        byte[] pvtKeyBytes = Base64.getDecoder().decode(ConstantFields.base64PvtKey);

        return null;

    }
}
