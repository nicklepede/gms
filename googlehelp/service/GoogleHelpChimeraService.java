package com.google.android.gms.googlehelp.service;

import android.accounts.Account;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;
import defpackage.asej;
import defpackage.asot;
import defpackage.bipo;
import defpackage.bipq;
import defpackage.biqq;
import defpackage.biqs;
import defpackage.bivh;
import defpackage.bjab;
import defpackage.bjay;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.byhr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GoogleHelpChimeraService extends bxgd implements bipo {
    public static final asot a = asot.b("gH_GoogleHelpService", asej.GOOGLE_HELP);
    public static List b;
    public bivh c;
    public bipq d;
    private bjay m;
    private biqq n;

    public GoogleHelpChimeraService() {
        super(63, "com.google.android.gms.googlehelp.service.GoogleHelpService.START", Collections.EMPTY_SET, 2, 9);
        this.n = new biqq();
        new byhr(Looper.getMainLooper());
    }

    public static biqs c(HelpConfig helpConfig) {
        return d(f(helpConfig));
    }

    public static synchronized biqs d(String str) {
        synchronized (GoogleHelpChimeraService.class) {
            if (b == null) {
                return null;
            }
            for (int i = 0; i < b.size(); i++) {
                biqs biqsVar = (biqs) b.get(i);
                if (TextUtils.equals(biqsVar.a, str)) {
                    return biqsVar;
                }
            }
            return null;
        }
    }

    public static String f(HelpConfig helpConfig) {
        String g = helpConfig.g() != null ? helpConfig.g() : "unknown_package_name";
        Account account = helpConfig.d;
        return String.valueOf(g).concat(String.valueOf(account != null ? account.name : "unknown_account_name"));
    }

    public static synchronized void h(String str) {
        synchronized (GoogleHelpChimeraService.class) {
            List list = b;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (TextUtils.equals(((biqs) b.get(i)).a, str)) {
                        if (size == 1) {
                            b = null;
                            return;
                        } else {
                            b.remove(i);
                            return;
                        }
                    }
                }
            }
        }
    }

    public static synchronized void i(HelpConfig helpConfig, boolean z) {
        synchronized (GoogleHelpChimeraService.class) {
            String f = f(helpConfig);
            if (b == null) {
                ArrayList arrayList = new ArrayList(1);
                b = arrayList;
                arrayList.add(new biqs(f, helpConfig.ag, z));
                return;
            }
            biqs d = d(f);
            if (d == null) {
                b.add(new biqs(f, helpConfig.ag, z));
                return;
            }
            d.b = helpConfig.ag;
            d.c(false);
            d.b(false);
            d.c = z;
            d.a();
        }
    }

    public static synchronized void j(HelpConfig helpConfig) {
        synchronized (GoogleHelpChimeraService.class) {
            biqs c = c(helpConfig);
            if (c != null && c.b == helpConfig.ag) {
                c.b(true);
            }
        }
    }

    public static synchronized void k(HelpConfig helpConfig) {
        synchronized (GoogleHelpChimeraService.class) {
            biqs c = c(helpConfig);
            if (c != null && c.b == helpConfig.ag) {
                c.c(true);
            }
        }
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new bjab(this, getServiceRequest.f));
    }

    @Override // defpackage.bipo
    public final synchronized void b(bipq bipqVar) {
        biqq biqqVar = this.n;
        if (biqqVar == null) {
            return;
        }
        this.d = bipqVar;
        biqqVar.b();
        this.n = null;
    }

    public final bjay e() {
        if (this.m == null) {
            this.m = new bjay(this);
        }
        return this.m;
    }

    public final synchronized void g(final bipo bipoVar) {
        bipq bipqVar = this.d;
        if (bipqVar != null) {
            bipoVar.b(bipqVar);
            return;
        }
        biqq biqqVar = this.n;
        if (biqqVar != null) {
            biqqVar.addObserver(new Observer() { // from class: bjfc
                @Override // java.util.Observer
                public final void update(Observable observable, Object obj) {
                    bipoVar.b(GoogleHelpChimeraService.this.d);
                }
            });
        }
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService, defpackage.qan
    public final void onDestroy() {
        bjay bjayVar = this.m;
        if (bjayVar != null) {
            bjayVar.close();
        }
        bivh bivhVar = this.c;
        if (bivhVar != null) {
            bivhVar.close();
        }
        super.onDestroy();
    }
}
