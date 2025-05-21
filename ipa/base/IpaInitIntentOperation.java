package com.google.android.gms.ipa.base;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ipa.base.IpaInitIntentOperation;
import com.google.android.gms.ipa.mediastoreindexer.MediastoreCorporaInstantIndexingBoundService;
import defpackage.anya;
import defpackage.asej;
import defpackage.asiu;
import defpackage.asng;
import defpackage.asot;
import defpackage.bonb;
import defpackage.bons;
import defpackage.bont;
import defpackage.bopn;
import defpackage.boqt;
import defpackage.ejhf;
import defpackage.fpgv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class IpaInitIntentOperation extends anya {
    public static final /* synthetic */ int a = 0;
    private static final String[] b = {"com.google.android.gms.ipa.base.IpaGcmTaskService"};
    private static final asot c = asot.b("GmscoreIpa", asej.PLATFORM_DATA_INDEXER);

    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
        if (fpgv.o()) {
            new boqt(getApplicationContext().getSharedPreferences("MediastoreIndexerSharedPrefs", 0)).f();
        }
        if (fpgv.j() && fpgv.a.a().F()) {
            getApplicationContext();
            final bonb c2 = bonb.c();
            if (c2 != null) {
                bont.a().b(new Runnable() { // from class: bonm
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = IpaInitIntentOperation.a;
                        try {
                            bonb.this.b();
                        } catch (Exception unused) {
                            bons.a().c(49);
                        }
                    }
                });
            }
        }
        String str = b[0];
        try {
            asng.H(this, str, true);
        } catch (IllegalArgumentException e) {
            ((ejhf) ((ejhf) c.i()).ah(5358)).P("Component %s invalid: %s", str, e.getMessage());
            bons.a().c(6);
        }
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        IpaGcmTaskChimeraService.d(getBaseContext());
        if (fpgv.m()) {
            return;
        }
        Context applicationContext = getApplicationContext();
        Intent startIntent = MediastoreCorporaInstantIndexingBoundService.getStartIntent(applicationContext, "com.google.android.gms.ipa.mediastoreindexer.PERSISTENT_START");
        if (startIntent == null) {
            ((ejhf) MediastoreCorporaInstantIndexingBoundService.a.i()).x("Service intent not available.");
        } else {
            asiu.a().d(applicationContext, startIntent, new bopn(applicationContext), 1);
        }
    }
}
