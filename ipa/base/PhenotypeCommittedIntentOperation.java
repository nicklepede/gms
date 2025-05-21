package com.google.android.gms.ipa.base;

import android.content.ContentResolver;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.chimera.IntentOperation;
import defpackage.aqxd;
import defpackage.asqg;
import defpackage.bonb;
import defpackage.bopm;
import defpackage.boqo;
import defpackage.boqt;
import defpackage.cvzk;
import defpackage.dvlw;
import defpackage.dvmh;
import defpackage.fpgv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class PhenotypeCommittedIntentOperation extends IntentOperation {
    private static final String a = asqg.f("com.google.android.gms.ipa");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (("com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) || a.equals(intent.getAction())) && "com.google.android.gms.ipa".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            ContentResolver contentResolver = getBaseContext().getContentResolver();
            aqxd aqxdVar = cvzk.a;
            dvlw a2 = dvlw.a(contentResolver, dvmh.a("com.google.android.gms.ipa"), new Runnable() { // from class: bonn
                @Override // java.lang.Runnable
                public final void run() {
                    dvni.e();
                }
            });
            if (a2 != null) {
                a2.e();
            }
            IpaGcmTaskChimeraService.d(getBaseContext());
            getBaseContext();
            bonb.c();
            if (!boqo.d(getBaseContext()) || fpgv.m()) {
                bopm.c(getBaseContext());
            } else {
                bopm.b(getBaseContext());
            }
            boqt boqtVar = new boqt(getSharedPreferences("MediastoreIndexerSharedPrefs", 0));
            SharedPreferences sharedPreferences = boqtVar.a;
            boolean k = fpgv.k();
            if (sharedPreferences.getBoolean("audio_media_files_indexing_enabled", false) ^ k) {
                if (k) {
                    boqtVar.f();
                }
                sharedPreferences.edit().putBoolean("audio_media_files_indexing_enabled", k).commit();
            }
            boolean n = fpgv.n();
            if (sharedPreferences.getBoolean("id_based_mediastore_indexing_enabled", false) ^ n) {
                boqtVar.f();
                sharedPreferences.edit().putBoolean("id_based_mediastore_indexing_enabled", n).commit();
            }
        }
    }
}
