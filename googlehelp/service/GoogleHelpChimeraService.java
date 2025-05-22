package com.google.android.gms.googlehelp.service;

import android.accounts.Account;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bkud;
import defpackage.bkuf;
import defpackage.bkvf;
import defpackage.bkvh;
import defpackage.bkzw;
import defpackage.bleq;
import defpackage.blfn;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.caqj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GoogleHelpChimeraService extends bzot implements bkud {
    public static final ausn a = ausn.b("gH_GoogleHelpService", auid.GOOGLE_HELP);
    public static List b;
    public bkzw c;
    public bkuf d;
    private blfn m;
    private bkvf n;

    public GoogleHelpChimeraService() {
        super(63, "com.google.android.gms.googlehelp.service.GoogleHelpService.START", Collections.EMPTY_SET, 2, 9);
        this.n = new bkvf();
        new caqj(Looper.getMainLooper());
    }

    public static bkvh c(HelpConfig helpConfig) {
        return d(f(helpConfig));
    }

    public static synchronized bkvh d(String str) {
        synchronized (GoogleHelpChimeraService.class) {
            if (b == null) {
                return null;
            }
            for (int i = 0; i < b.size(); i++) {
                bkvh bkvhVar = (bkvh) b.get(i);
                if (TextUtils.equals(bkvhVar.a, str)) {
                    return bkvhVar;
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
                    if (TextUtils.equals(((bkvh) b.get(i)).a, str)) {
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
                arrayList.add(new bkvh(f, helpConfig.ag, z));
                return;
            }
            bkvh d = d(f);
            if (d == null) {
                b.add(new bkvh(f, helpConfig.ag, z));
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
            bkvh c = c(helpConfig);
            if (c != null && c.b == helpConfig.ag) {
                c.b(true);
            }
        }
    }

    public static synchronized void k(HelpConfig helpConfig) {
        synchronized (GoogleHelpChimeraService.class) {
            bkvh c = c(helpConfig);
            if (c != null && c.b == helpConfig.ag) {
                c.c(true);
            }
        }
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new bleq(this, getServiceRequest.f));
    }

    @Override // defpackage.bkud
    public final synchronized void b(bkuf bkufVar) {
        bkvf bkvfVar = this.n;
        if (bkvfVar == null) {
            return;
        }
        this.d = bkufVar;
        bkvfVar.b();
        this.n = null;
    }

    public final blfn e() {
        if (this.m == null) {
            this.m = new blfn(this);
        }
        return this.m;
    }

    public final synchronized void g(final bkud bkudVar) {
        bkuf bkufVar = this.d;
        if (bkufVar != null) {
            bkudVar.b(bkufVar);
            return;
        }
        bkvf bkvfVar = this.n;
        if (bkvfVar != null) {
            bkvfVar.addObserver(new Observer() { // from class: bljr
                @Override // java.util.Observer
                public final void update(Observable observable, Object obj) {
                    bkudVar.b(GoogleHelpChimeraService.this.d);
                }
            });
        }
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onDestroy() {
        blfn blfnVar = this.m;
        if (blfnVar != null) {
            blfnVar.close();
        }
        bkzw bkzwVar = this.c;
        if (bkzwVar != null) {
            bkzwVar.close();
        }
        super.onDestroy();
    }
}
