package com.google.android.gms.common.reshelper;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import defpackage.apsz;
import defpackage.apta;
import defpackage.apul;
import defpackage.asbt;
import defpackage.asej;
import defpackage.asop;
import defpackage.asot;
import defpackage.bqpt;
import defpackage.btji;
import defpackage.ejhf;
import defpackage.emzs;
import defpackage.emzw;
import defpackage.emzx;
import defpackage.epit;
import defpackage.febw;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.fmps;
import defpackage.fmxg;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class LocaleChangedIntentOperation extends IntentOperation {
    private static final asot a = asot.b("LocaleChangeIO", asej.CORE);
    private final apta b;

    public LocaleChangedIntentOperation() {
        this.b = null;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action;
        char c;
        byte[] byteArrayExtra;
        if (fmps.f() && (action = intent.getAction()) != null) {
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
                    emzw emzwVar = (emzw) emzx.a.v();
                    try {
                        fecp y = fecp.y(emzs.a, byteArrayExtra, 0, byteArrayExtra.length, febw.a());
                        fecp.M(y);
                        emzs emzsVar = (emzs) y;
                        if (!emzwVar.b.L()) {
                            emzwVar.U();
                        }
                        emzx emzxVar = (emzx) emzwVar.b;
                        emzsVar.getClass();
                        emzxVar.l = emzsVar;
                        emzxVar.b |= 64;
                        apul b = bqpt.b(this);
                        if (fmxg.a.a().c()) {
                            btji.v().f((emzx) emzwVar.Q());
                            return;
                        }
                        apta aptaVar = this.b;
                        if (aptaVar == null) {
                            aptaVar = asbt.d(this);
                        }
                        apsz j = aptaVar.j(emzwVar.Q(), b);
                        j.l(13);
                        j.d();
                        return;
                    } catch (fedk unused) {
                        ((ejhf) a.j()).x("Dropping malformed log event");
                        return;
                    }
                }
                return;
            }
            if (asop.c(fmxg.c())) {
                return;
            }
            String language = getResources().getConfiguration().locale.getLanguage();
            fecj v = emzs.a.v();
            if (!v.b.L()) {
                v.U();
            }
            fecp fecpVar = v.b;
            emzs emzsVar2 = (emzs) fecpVar;
            emzsVar2.c = 1;
            emzsVar2.b |= 1;
            if (!fecpVar.L()) {
                v.U();
            }
            emzs emzsVar3 = (emzs) v.b;
            language.getClass();
            emzsVar3.b |= 2;
            emzsVar3.d = language;
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                try {
                    epit i = epit.i(this, getResources(), fmxg.e());
                    try {
                        Resources resources = getResources();
                        if (i.a(resources, getPackageName())) {
                            if (i.c(resources, language, getPackageName())) {
                                Context h = epit.h(this);
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
                            emzs emzsVar4 = (emzs) v.b;
                            emzsVar4.b |= 4;
                            emzsVar4.e = (int) j2;
                            c2 = 2;
                        }
                        Intent startIntent = IntentOperation.getStartIntent(this, LocaleChangedIntentOperation.class, "com.google.android.gms.common.LEMON_LOG");
                        if (startIntent != null) {
                            startService(startIntent.putExtra("proto", ((emzs) v.Q()).r()));
                        }
                        if (c2 != 2 && c2 != 3) {
                            ((ejhf) a.h()).B("No action required after switch to %s", language);
                        } else {
                            ((ejhf) a.h()).x("Requesting GmsCore restart due to change in locale assets");
                            sendBroadcast(new Intent("com.google.android.gms.common.LANGUAGE_RELOAD").setPackage(getPackageName()).putExtra("lang", language));
                        }
                    } catch (IOException e) {
                        throw new RuntimeException("Unable to extract language ".concat(String.valueOf(language)), e);
                    }
                } catch (RuntimeException e2) {
                    String message = e2.getMessage();
                    ((ejhf) a.i()).P("Failed extracting language %s: %s", language, message);
                    if (message != null) {
                        if (!v.b.L()) {
                            v.U();
                        }
                        emzs emzsVar5 = (emzs) v.b;
                        emzsVar5.b |= 8;
                        emzsVar5.f = message;
                    }
                    Intent startIntent2 = IntentOperation.getStartIntent(this, LocaleChangedIntentOperation.class, "com.google.android.gms.common.LEMON_LOG");
                    if (startIntent2 != null) {
                        startService(startIntent2.putExtra("proto", ((emzs) v.Q()).r()));
                    }
                }
            } catch (Throwable th) {
                Intent startIntent3 = IntentOperation.getStartIntent(this, LocaleChangedIntentOperation.class, "com.google.android.gms.common.LEMON_LOG");
                if (startIntent3 != null) {
                    startService(startIntent3.putExtra("proto", ((emzs) v.Q()).r()));
                }
                throw th;
            }
        }
    }

    protected LocaleChangedIntentOperation(apta aptaVar) {
        this.b = aptaVar;
    }
}
