package com.google.android.gms.ocr.service;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.ocr.service.OcrModelUpdateStateIntentOperation;
import com.google.android.gms.vision.text.internal.client.TextRecognizerOptions;
import defpackage.atad;
import defpackage.atai;
import defpackage.atfd;
import defpackage.atfn;
import defpackage.aucp;
import defpackage.aura;
import defpackage.auua;
import defpackage.btco;
import defpackage.chct;
import defpackage.curt;
import defpackage.cuto;
import defpackage.cutp;
import defpackage.cutr;
import defpackage.cuty;
import defpackage.dhmr;
import defpackage.dkod;
import defpackage.fpmr;
import defpackage.ftjb;
import defpackage.ftje;
import java.io.File;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class OcrModelUpdateStateIntentOperation extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private static final String b = auua.f("com.google.android.gms.ocr");
    private cutr c;

    public OcrModelUpdateStateIntentOperation() {
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.gms.ocr.MODEL_UPDATE_ACTION".equals(action) || "com.google.gservices.intent.action.GSERVICES_CHANGED".equals(action) || (("com.google.android.gms.phenotype.COMMITTED".equals(action) || b.equals(action)) && "com.google.android.gms.ocr".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME")))) {
            boolean a2 = cuto.a(this, new curt() { // from class: cuuj
                @Override // defpackage.curt
                public final void a(int i) {
                    int i2 = OcrModelUpdateStateIntentOperation.a;
                }
            }, new cutp(getPackageManager()));
            aura.H(this, "com.google.android.gms.ocr.SecuredCreditCardOcrActivity", a2);
            aura.H(this, "com.google.android.gms.ocr.GiftCardOcrActivity", (a2 && ftje.a.lK().b()) ? dkod.a(this, new TextRecognizerOptions()).c() : a2);
            if (ftjb.c()) {
                Log.i("OcrModelUpStIntentOp", "Downloading text recognizer");
                sendBroadcast(new Intent("com.google.android.gms.vision.DEPENDENCY").setPackage("com.google.android.gms").putExtra("com.google.android.gms.vision.DEPENDENCIES", "ocr"));
                if (this.c == null) {
                    this.c = new cutr(this);
                }
                cutr cutrVar = this.c;
                atai ataiVar = cutrVar.a;
                final ApiFeatureRequest f = aucp.f(cutrVar.a());
                if (f.a.isEmpty()) {
                    dhmr.d(null);
                } else {
                    atfn atfnVar = new atfn();
                    atfnVar.c = new Feature[]{chct.a};
                    atfnVar.d = 27302;
                    atfnVar.b = false;
                    atfnVar.a = new atfd() { // from class: auch
                        @Override // defpackage.atfd
                        public final void d(Object obj, Object obj2) {
                            int i = aucp.a;
                            ((aubx) ((aucq) obj).H()).b(new auck((dhma) obj2), ApiFeatureRequest.this, null);
                        }
                    };
                    ((atad) ataiVar).jd(atfnVar.a());
                }
            }
            Context applicationContext = getApplicationContext();
            File[] listFiles = (fpmr.i() ? new File(btco.a.b(applicationContext.getFilesDir(), "commerce_ocr")) : new File(applicationContext.getFilesDir(), "commerce_ocr")).listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    String name = file.getName();
                    if (!"params_expdate_c45e5b7.dat".equals(name) && !"params_chname_convnet.dat.gz".equals(name)) {
                        Log.i("OcrModelUpStIntentOp", "Deleting ".concat(String.valueOf(file.getName())));
                        file.delete();
                    }
                }
            }
            cuty cutyVar = new cuty(getApplicationContext(), a2);
            cutyVar.c(3);
            cutyVar.d(3);
        }
    }

    public OcrModelUpdateStateIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
