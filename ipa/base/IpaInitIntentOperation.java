package com.google.android.gms.ipa.base;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ipa.base.IpaInitIntentOperation;
import com.google.android.gms.ipa.mediastoreindexer.MediastoreCorporaInstantIndexingBoundService;
import defpackage.apzs;
import defpackage.auid;
import defpackage.aumo;
import defpackage.aura;
import defpackage.ausn;
import defpackage.bqur;
import defpackage.bqvi;
import defpackage.bqvj;
import defpackage.bqxd;
import defpackage.bqyj;
import defpackage.eluo;
import defpackage.fsah;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class IpaInitIntentOperation extends apzs {
    public static final /* synthetic */ int a = 0;
    private static final String[] b = {"com.google.android.gms.ipa.base.IpaGcmTaskService"};
    private static final ausn c = ausn.b("GmscoreIpa", auid.PLATFORM_DATA_INDEXER);

    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
        if (fsah.o()) {
            new bqyj(getApplicationContext().getSharedPreferences("MediastoreIndexerSharedPrefs", 0)).f();
        }
        if (fsah.j() && fsah.a.lK().F()) {
            getApplicationContext();
            final bqur c2 = bqur.c();
            if (c2 != null) {
                bqvj.a().b(new Runnable() { // from class: bqvc
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = IpaInitIntentOperation.a;
                        try {
                            bqur.this.b();
                        } catch (Exception unused) {
                            bqvi.a().c(49);
                        }
                    }
                });
            }
        }
        String str = b[0];
        try {
            aura.H(this, str, true);
        } catch (IllegalArgumentException e) {
            ((eluo) ((eluo) c.i()).ai(5371)).P("Component %s invalid: %s", str, e.getMessage());
            bqvi.a().c(6);
        }
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        IpaGcmTaskChimeraService.d(getBaseContext());
        if (fsah.m()) {
            return;
        }
        Context applicationContext = getApplicationContext();
        Intent startIntent = MediastoreCorporaInstantIndexingBoundService.getStartIntent(applicationContext, "com.google.android.gms.ipa.mediastoreindexer.PERSISTENT_START");
        if (startIntent == null) {
            ((eluo) MediastoreCorporaInstantIndexingBoundService.a.i()).x("Service intent not available.");
        } else {
            aumo.a().d(applicationContext, startIntent, new bqxd(applicationContext), 1);
        }
    }
}
