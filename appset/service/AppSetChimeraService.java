package com.google.android.gms.appset.service;

import com.google.android.gms.appset.service.AppSetChimeraService;
import com.google.android.gms.chimera.modules.appset.AppContextProvider;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.ekut;
import defpackage.elgx;
import defpackage.elpp;
import defpackage.eqdl;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.eqgo;
import defpackage.fmqs;
import defpackage.wcq;
import defpackage.wec;
import defpackage.wfe;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AppSetChimeraService extends bzot {
    public static final /* synthetic */ int b = 0;
    eqgl a;
    private final eqgo c;
    private boolean d;

    public AppSetChimeraService() {
        super(new int[]{300}, new String[]{"com.google.android.gms.appset.service.START"}, elpp.a, 3, wfe.a(), (elgx) null);
        setWantIntentExtras(false);
        this.c = wfe.a();
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new wec(this.d, m(this.c), new wcq(this.a)));
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        AppContextProvider.a();
        boolean i = fmqs.i();
        this.d = i;
        if (i) {
            this.a = this.c.submit(new Callable() { // from class: weq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    AppSetChimeraService appSetChimeraService = AppSetChimeraService.this;
                    return new wdq(new wdu(appSetChimeraService, appSetChimeraService.getClass().getName()));
                }
            });
        } else {
            this.a = eqgc.g();
        }
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onDestroy() {
        if (this.d) {
            eqdl.f(this.a, new ekut() { // from class: wer
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    int i = AppSetChimeraService.b;
                    ((wdq) ((wdw) obj)).c();
                    return null;
                }
            }, this.c);
        }
        super.onDestroy();
    }
}
