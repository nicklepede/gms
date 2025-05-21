package com.google.android.gms.ocr.service;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.ocr.service.OcrModelUpdateStateIntentOperation;
import com.google.android.gms.vision.text.internal.client.TextRecognizerOptions;
import defpackage.aqxo;
import defpackage.aqxt;
import defpackage.arco;
import defpackage.arcy;
import defpackage.asaa;
import defpackage.asng;
import defpackage.asqg;
import defpackage.bqux;
import defpackage.cetl;
import defpackage.csio;
import defpackage.cskj;
import defpackage.cskk;
import defpackage.cskm;
import defpackage.cskt;
import defpackage.dfbl;
import defpackage.dics;
import defpackage.fmut;
import defpackage.fqpe;
import defpackage.fqph;
import java.io.File;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class OcrModelUpdateStateIntentOperation extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private static final String b = asqg.f("com.google.android.gms.ocr");
    private cskm c;

    public OcrModelUpdateStateIntentOperation() {
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.gms.ocr.MODEL_UPDATE_ACTION".equals(action) || "com.google.gservices.intent.action.GSERVICES_CHANGED".equals(action) || (("com.google.android.gms.phenotype.COMMITTED".equals(action) || b.equals(action)) && "com.google.android.gms.ocr".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME")))) {
            boolean a2 = cskj.a(this, new csio() { // from class: csle
                @Override // defpackage.csio
                public final void a(int i) {
                    int i2 = OcrModelUpdateStateIntentOperation.a;
                }
            }, new cskk(getPackageManager()));
            asng.H(this, "com.google.android.gms.ocr.SecuredCreditCardOcrActivity", a2);
            asng.H(this, "com.google.android.gms.ocr.GiftCardOcrActivity", (a2 && fqph.a.a().b()) ? dics.a(this, new TextRecognizerOptions()).c() : a2);
            if (fqpe.c()) {
                Log.i("OcrModelUpStIntentOp", "Downloading text recognizer");
                sendBroadcast(new Intent("com.google.android.gms.vision.DEPENDENCY").setPackage("com.google.android.gms").putExtra("com.google.android.gms.vision.DEPENDENCIES", "ocr"));
                if (this.c == null) {
                    this.c = new cskm(this);
                }
                cskm cskmVar = this.c;
                aqxt aqxtVar = cskmVar.a;
                final ApiFeatureRequest f = asaa.f(cskmVar.a());
                if (f.a.isEmpty()) {
                    dfbl.d(null);
                } else {
                    arcy arcyVar = new arcy();
                    arcyVar.c = new Feature[]{cetl.a};
                    arcyVar.d = 27302;
                    arcyVar.b = false;
                    arcyVar.a = new arco() { // from class: arzs
                        @Override // defpackage.arco
                        public final void d(Object obj, Object obj2) {
                            int i = asaa.a;
                            ((arzi) ((asab) obj).H()).b(new arzv((dfau) obj2), ApiFeatureRequest.this, null);
                        }
                    };
                    ((aqxo) aqxtVar).iO(arcyVar.a());
                }
            }
            Context applicationContext = getApplicationContext();
            File[] listFiles = (fmut.i() ? new File(bqux.a.b(applicationContext.getFilesDir(), "commerce_ocr")) : new File(applicationContext.getFilesDir(), "commerce_ocr")).listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    String name = file.getName();
                    if (!"params_expdate_c45e5b7.dat".equals(name) && !"params_chname_convnet.dat.gz".equals(name)) {
                        Log.i("OcrModelUpStIntentOp", "Deleting ".concat(String.valueOf(file.getName())));
                        file.delete();
                    }
                }
            }
            cskt csktVar = new cskt(getApplicationContext(), a2);
            csktVar.c(3);
            csktVar.d(3);
        }
    }

    public OcrModelUpdateStateIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
