package com.google.android.gms.ipa.base;

import android.content.ContentResolver;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.chimera.IntentOperation;
import defpackage.aszs;
import defpackage.auua;
import defpackage.bqur;
import defpackage.bqxc;
import defpackage.bqye;
import defpackage.bqyj;
import defpackage.cyjh;
import defpackage.dxwx;
import defpackage.dxxi;
import defpackage.fsah;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class PhenotypeCommittedIntentOperation extends IntentOperation {
    private static final String a = auua.f("com.google.android.gms.ipa");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (("com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) || a.equals(intent.getAction())) && "com.google.android.gms.ipa".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            ContentResolver contentResolver = getBaseContext().getContentResolver();
            aszs aszsVar = cyjh.a;
            dxwx a2 = dxwx.a(contentResolver, dxxi.a("com.google.android.gms.ipa"), new Runnable() { // from class: bqvd
                @Override // java.lang.Runnable
                public final void run() {
                    dxyi.e();
                }
            });
            if (a2 != null) {
                a2.e();
            }
            IpaGcmTaskChimeraService.d(getBaseContext());
            getBaseContext();
            bqur.c();
            if (!bqye.d(getBaseContext()) || fsah.m()) {
                bqxc.c(getBaseContext());
            } else {
                bqxc.b(getBaseContext());
            }
            bqyj bqyjVar = new bqyj(getSharedPreferences("MediastoreIndexerSharedPrefs", 0));
            SharedPreferences sharedPreferences = bqyjVar.a;
            boolean k = fsah.k();
            if (sharedPreferences.getBoolean("audio_media_files_indexing_enabled", false) ^ k) {
                if (k) {
                    bqyjVar.f();
                }
                sharedPreferences.edit().putBoolean("audio_media_files_indexing_enabled", k).commit();
            }
            boolean n = fsah.n();
            if (sharedPreferences.getBoolean("id_based_mediastore_indexing_enabled", false) ^ n) {
                bqyjVar.f();
                sharedPreferences.edit().putBoolean("id_based_mediastore_indexing_enabled", n).commit();
            }
        }
    }
}
