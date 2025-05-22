package com.google.android.gms.common.reshelper;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import defpackage.arvq;
import defpackage.arvr;
import defpackage.arxc;
import defpackage.auei;
import defpackage.auid;
import defpackage.ausj;
import defpackage.ausn;
import defpackage.bsxk;
import defpackage.bvrg;
import defpackage.eluo;
import defpackage.epnj;
import defpackage.epnn;
import defpackage.epno;
import defpackage.erws;
import defpackage.fgqp;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.fphq;
import defpackage.fppf;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class LocaleChangedIntentOperation extends IntentOperation {
    private static final ausn a = ausn.b("LocaleChangeIO", auid.CORE);
    private final arvr b;

    public LocaleChangedIntentOperation() {
        this.b = null;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action;
        char c;
        byte[] byteArrayExtra;
        if (fphq.f() && (action = intent.getAction()) != null) {
            int hashCode = action.hashCode();
            char c2 = 1;
            if (hashCode != -19011148) {
                if (hashCode == 307286717 && action.equals("com.google.android.gms.common.LEMON_LOG")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (action.equals("android.intent.action.LOCALE_CHANGED")) {
                    c = 0;
                }
                c = 65535;
            }
            if (c != 0) {
                if (c == 1 && (byteArrayExtra = intent.getByteArrayExtra("proto")) != null) {
                    epnn epnnVar = (epnn) epno.a.v();
                    try {
                        fgri y = fgri.y(epnj.a, byteArrayExtra, 0, byteArrayExtra.length, fgqp.a());
                        fgri.M(y);
                        epnj epnjVar = (epnj) y;
                        if (!epnnVar.b.L()) {
                            epnnVar.U();
                        }
                        epno epnoVar = (epno) epnnVar.b;
                        epnjVar.getClass();
                        epnoVar.l = epnjVar;
                        epnoVar.b |= 64;
                        arxc b = bsxk.b(this);
                        if (fppf.a.lK().c()) {
                            bvrg.v().f((epno) epnnVar.Q());
                            return;
                        }
                        arvr arvrVar = this.b;
                        if (arvrVar == null) {
                            arvrVar = auei.d(this);
                        }
                        arvq j = arvrVar.j(epnnVar.Q(), b);
                        j.l(13);
                        j.d();
                        return;
                    } catch (fgsd unused) {
                        ((eluo) a.j()).x("Dropping malformed log event");
                        return;
                    }
                }
                return;
            }
            if (ausj.c(fppf.c())) {
                return;
            }
            String language = getResources().getConfiguration().locale.getLanguage();
            fgrc v = epnj.a.v();
            if (!v.b.L()) {
                v.U();
            }
            fgri fgriVar = v.b;
            epnj epnjVar2 = (epnj) fgriVar;
            epnjVar2.c = 1;
            epnjVar2.b |= 1;
            if (!fgriVar.L()) {
                v.U();
            }
            epnj epnjVar3 = (epnj) v.b;
            language.getClass();
            epnjVar3.b |= 2;
            epnjVar3.d = language;
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                try {
                    erws i = erws.i(this, getResources(), fppf.e());
                    try {
                        Resources resources = getResources();
                        if (i.a(resources, getPackageName())) {
                            if (i.c(resources, language, getPackageName())) {
                                Context h = erws.h(this);
                                if (i.b(h, language)) {
                                    c2 = 3;
                                } else {
                                    i.e(h, getAssets(), language);
                                    c2 = 2;
                                }
                            } else {
                                c2 = 4;
                            }
                        }
                        long uptimeMillis2 = SystemClock.uptimeMillis();
                        if (c2 == 2) {
                            long j2 = uptimeMillis2 - uptimeMillis;
                            if (!v.b.L()) {
                                v.U();
                            }
                            epnj epnjVar4 = (epnj) v.b;
                            epnjVar4.b |= 4;
                            epnjVar4.e = (int) j2;
                            c2 = 2;
                        }
                        Intent startIntent = IntentOperation.getStartIntent(this, LocaleChangedIntentOperation.class, "com.google.android.gms.common.LEMON_LOG");
                        if (startIntent != null) {
                            startService(startIntent.putExtra("proto", ((epnj) v.Q()).r()));
                        }
                        if (c2 != 2 && c2 != 3) {
                            ((eluo) a.h()).B("No action required after switch to %s", language);
                        } else {
                            ((eluo) a.h()).x("Requesting GmsCore restart due to change in locale assets");
                            sendBroadcast(new Intent("com.google.android.gms.common.LANGUAGE_RELOAD").setPackage(getPackageName()).putExtra("lang", language));
                        }
                    } catch (IOException e) {
                        throw new RuntimeException("Unable to extract language ".concat(String.valueOf(language)), e);
                    }
                } catch (RuntimeException e2) {
                    String message = e2.getMessage();
                    ((eluo) a.i()).P("Failed extracting language %s: %s", language, message);
                    if (message != null) {
                        if (!v.b.L()) {
                            v.U();
                        }
                        epnj epnjVar5 = (epnj) v.b;
                        epnjVar5.b |= 8;
                        epnjVar5.f = message;
                    }
                    Intent startIntent2 = IntentOperation.getStartIntent(this, LocaleChangedIntentOperation.class, "com.google.android.gms.common.LEMON_LOG");
                    if (startIntent2 != null) {
                        startService(startIntent2.putExtra("proto", ((epnj) v.Q()).r()));
                    }
                }
            } catch (Throwable th) {
                Intent startIntent3 = IntentOperation.getStartIntent(this, LocaleChangedIntentOperation.class, "com.google.android.gms.common.LEMON_LOG");
                if (startIntent3 != null) {
                    startService(startIntent3.putExtra("proto", ((epnj) v.Q()).r()));
                }
                throw th;
            }
        }
    }

    protected LocaleChangedIntentOperation(arvr arvrVar) {
        this.b = arvrVar;
    }
}
