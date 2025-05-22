package com.google.android.gms.vision.service.operation;

import android.content.Context;
import android.os.Build;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.ModuleManager;
import defpackage.dkmn;
import defpackage.dknl;
import defpackage.dknw;
import defpackage.dkny;
import defpackage.elgt;
import defpackage.elgx;
import defpackage.gbxc;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class DownloadDependencyOperation extends IntentOperation {
    private static final String[] a;
    private static final elgx b;
    private final Set c = new HashSet();
    private Set d;
    private boolean e;
    private dknw f;
    private Context g;
    private gbxc h;
    private dkny i;
    private String j;

    static {
        int i = dknl.a;
        String[] strArr = Build.SUPPORTED_ABIS;
        a = strArr;
        dkmn.c("Supported ABIS: %s", Arrays.toString(strArr));
        elgt elgtVar = new elgt();
        elgtVar.i("barcode", "vision.barcode");
        elgtVar.i("face", "vision.face");
        elgtVar.i("ocr", "vision.ocr");
        elgtVar.i("ica", "vision.ica");
        elgtVar.i("custom_ica", "vision.custom.ica");
        elgtVar.i("langid", "mlkit.langid");
        elgtVar.i("nlclassifier", "mlkit.nlclassifier");
        elgtVar.i("tflite_dynamite", "tflite_dynamite");
        elgtVar.i("barcode_ui", "mlkit.barcode.ui");
        elgtVar.i("ocr_chinese", "mlkit.ocr.chinese");
        elgtVar.i("ocr_devanagari", "mlkit.ocr.devanagari");
        elgtVar.i("ocr_japanese", "mlkit.ocr.japanese");
        elgtVar.i("ocr_korean", "mlkit.ocr.korean");
        elgtVar.i("smart_reply", "mlkit.smartreply");
        elgtVar.i("image_quality_aesthetic", "mlkit.quality.aesthetic");
        elgtVar.i("image_quality_technical", "mlkit.quality.technical");
        elgtVar.i("document_detect", "mlkit.docscan.detect");
        elgtVar.i("document_crop", "mlkit.docscan.crop");
        elgtVar.i("document_enhance", "mlkit.docscan.enhance");
        elgtVar.i("document_ui", "mlkit.docscan.ui");
        elgtVar.i("subject_segment", "mlkit.segmentation.subject");
        b = elgtVar.b();
    }

    private final boolean a(String str) {
        ModuleManager.FeatureCheck featureCheck = new ModuleManager.FeatureCheck();
        featureCheck.checkFeatureAtAnyVersion(str);
        return ModuleManager.get(this).checkFeaturesAreAvailable(featureCheck) == 0;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.g = getApplicationContext();
        this.f = new dknw(this.g);
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
