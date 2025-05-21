package com.google.android.gms.appset.service;

import com.google.android.gms.appset.service.AppSetChimeraService;
import com.google.android.gms.chimera.modules.appset.AppContextProvider;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.eiho;
import defpackage.eits;
import defpackage.ejck;
import defpackage.enps;
import defpackage.ensj;
import defpackage.enss;
import defpackage.ensv;
import defpackage.fkan;
import defpackage.ugr;
import defpackage.uid;
import defpackage.ujf;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AppSetChimeraService extends bxgd {
    public static final /* synthetic */ int b = 0;
    enss a;
    private final ensv c;
    private boolean d;

    public AppSetChimeraService() {
        super(new int[]{300}, new String[]{"com.google.android.gms.appset.service.START"}, ejck.a, 3, ujf.a(), (eits) null);
        setWantIntentExtras(false);
        this.c = ujf.a();
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new uid(this.d, m(this.c), new ugr(this.a)));
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        AppContextProvider.a();
        boolean i = fkan.i();
        this.d = i;
        if (i) {
            this.a = this.c.submit(new Callable() { // from class: uir
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    AppSetChimeraService appSetChimeraService = AppSetChimeraService.this;
                    return new uhr(new uhv(appSetChimeraService, appSetChimeraService.getClass().getName()));
                }
            });
        } else {
            this.a = ensj.g();
        }
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService, defpackage.qan
    public final void onDestroy() {
        if (this.d) {
            enps.f(this.a, new eiho() { // from class: uis
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    int i = AppSetChimeraService.b;
                    ((uhr) ((uhx) obj)).c();
                    return null;
                }
            }, this.c);
        }
        super.onDestroy();
    }
}
