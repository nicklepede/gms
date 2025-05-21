package com.google.android.gms.vision.service.operation;

import android.content.Context;
import android.os.Build;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.ModuleManager;
import defpackage.dibc;
import defpackage.dica;
import defpackage.dicl;
import defpackage.dicn;
import defpackage.eito;
import defpackage.eits;
import defpackage.fzai;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class DownloadDependencyOperation extends IntentOperation {
    private static final String[] a;
    private static final eits b;
    private final Set c = new HashSet();
    private Set d;
    private boolean e;
    private dicl f;
    private Context g;
    private fzai h;
    private dicn i;
    private String j;

    static {
        int i = dica.a;
        String[] strArr = Build.SUPPORTED_ABIS;
        a = strArr;
        dibc.c("Supported ABIS: %s", Arrays.toString(strArr));
        eito eitoVar = new eito();
        eitoVar.i("barcode", "vision.barcode");
        eitoVar.i("face", "vision.face");
        eitoVar.i("ocr", "vision.ocr");
        eitoVar.i("ica", "vision.ica");
        eitoVar.i("custom_ica", "vision.custom.ica");
        eitoVar.i("langid", "mlkit.langid");
        eitoVar.i("nlclassifier", "mlkit.nlclassifier");
        eitoVar.i("tflite_dynamite", "tflite_dynamite");
        eitoVar.i("barcode_ui", "mlkit.barcode.ui");
        eitoVar.i("ocr_chinese", "mlkit.ocr.chinese");
        eitoVar.i("ocr_devanagari", "mlkit.ocr.devanagari");
        eitoVar.i("ocr_japanese", "mlkit.ocr.japanese");
        eitoVar.i("ocr_korean", "mlkit.ocr.korean");
        eitoVar.i("smart_reply", "mlkit.smartreply");
        eitoVar.i("image_quality_aesthetic", "mlkit.quality.aesthetic");
        eitoVar.i("image_quality_technical", "mlkit.quality.technical");
        eitoVar.i("document_detect", "mlkit.docscan.detect");
        eitoVar.i("document_crop", "mlkit.docscan.crop");
        eitoVar.i("document_enhance", "mlkit.docscan.enhance");
        eitoVar.i("document_ui", "mlkit.docscan.ui");
        eitoVar.i("subject_segment", "mlkit.segmentation.subject");
        b = eitoVar.b();
    }

    private final boolean a(String str) {
        ModuleManager.FeatureCheck featureCheck = new ModuleManager.FeatureCheck();
        featureCheck.checkFeatureAtAnyVersion(str);
        return ModuleManager.get(this).checkFeaturesAreAvailable(featureCheck) == 0;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.g = getApplicationContext();
        this.f = new dicl(this.g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x03d5, code lost:
    
        if (r4.equals(1) != false) goto L138;
     */
    @Override // com.google.android.chimera.IntentOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleIntent(android.content.Intent r19) {
        /*
            Method dump skipped, instructions count: 1099
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.vision.service.operation.DownloadDependencyOperation.onHandleIntent(android.content.Intent):void");
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onDestroy() {
    }
}
