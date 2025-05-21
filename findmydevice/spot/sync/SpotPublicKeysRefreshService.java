package com.google.android.gms.findmydevice.spot.sync;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.findmydevice.spot.sync.SpotPublicKeysRefreshService;
import com.google.android.gms.findmydevice.util.SafeGmsTaskBoundService;
import defpackage.asej;
import defpackage.asnd;
import defpackage.asot;
import defpackage.bcyr;
import defpackage.bebe;
import defpackage.bebf;
import defpackage.bebo;
import defpackage.bebp;
import defpackage.bfcs;
import defpackage.bfdr;
import defpackage.byjl;
import defpackage.byln;
import defpackage.egmx;
import defpackage.ejhf;
import defpackage.enqc;
import defpackage.ensj;
import defpackage.enss;
import defpackage.fobb;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class SpotPublicKeysRefreshService extends SafeGmsTaskBoundService {
    public static final asot a = asot.b("SpotPublicKeysRfrshSvc", asej.FIND_MY_DEVICE_SPOT);
    private final bebe b;

    public SpotPublicKeysRefreshService() {
        this(bebo.a());
    }

    @Override // com.google.android.gms.findmydevice.util.SafeGmsTaskBoundService
    protected final enss d(byln bylnVar) {
        if (!bfdr.a()) {
            ((ejhf) ((ejhf) a.j()).ah((char) 4554)).x("Eddystone use cases are disabled.");
            return ensj.i(2);
        }
        Context baseContext = getBaseContext();
        ArrayDeque arrayDeque = new ArrayDeque(asnd.h(baseContext, baseContext.getPackageName()));
        if (!arrayDeque.isEmpty()) {
            return e(arrayDeque, false);
        }
        ((ejhf) ((ejhf) a.i()).ah((char) 4553)).x("No user accounts were available while refreshing the caches of SPOT public keys.");
        bfcs.h(byjl.a(this));
        return ensj.i(2);
    }

    public final enss e(final Deque deque, final boolean z) {
        if (!deque.isEmpty()) {
            final bebf a2 = this.b.a((Account) deque.removeFirst());
            return egmx.f(a2.c().e()).i(new enqc() { // from class: bfdb
                @Override // defpackage.enqc
                public final enss a(Object obj) {
                    if (!((Boolean) obj).booleanValue()) {
                        return SpotPublicKeysRefreshService.this.e(deque, z);
                    }
                    bebf bebfVar = a2;
                    Context b = bebk.b();
                    bebo beboVar = bebfVar.j;
                    dxhm dxhmVar = (dxhm) beboVar.p.a();
                    boolean z2 = beboVar.a.b;
                    dwep b2 = bcyn.b(bcyo.b(b, dxhmVar), new bcyk(bebfVar.f(), fobb.q()), (dnlf) beboVar.e.a(), bebo.W(), (Executor) beboVar.b.a());
                    return egna.h(egmx.f(b2.a(true)).h(new eiho() { // from class: dwem
                        @Override // defpackage.eiho
                        public final Object apply(Object obj2) {
                            return null;
                        }
                    }, b2.d)).a(new Callable() { // from class: bfde
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            asot asotVar = SpotPublicKeysRefreshService.a;
                            return 0;
                        }
                    }, enre.a);
                }
            }, a2.e()).e(bcyr.class, new enqc() { // from class: bfdc
                @Override // defpackage.enqc
                public final enss a(Object obj) {
                    bcyr bcyrVar = (bcyr) obj;
                    if (bcyrVar.d()) {
                        return ensj.h(bcyrVar);
                    }
                    Deque deque2 = deque;
                    SpotPublicKeysRefreshService spotPublicKeysRefreshService = SpotPublicKeysRefreshService.this;
                    ((ejhf) ((ejhf) ((ejhf) SpotPublicKeysRefreshService.a.j()).s(bcyrVar)).ah((char) 4551)).x("Failed refreshing the SPOT public keys cache because the account was unauthenticated. Will try again with another account, if available.");
                    return spotPublicKeysRefreshService.e(deque2, false);
                }
            }, a2.e()).e(Throwable.class, new enqc() { // from class: bfdd
                @Override // defpackage.enqc
                public final enss a(Object obj) {
                    ((ejhf) ((ejhf) ((ejhf) SpotPublicKeysRefreshService.a.j()).s((Throwable) obj)).ah((char) 4552)).x("Failed refreshing the SPOT public keys cache. Will try again with another account, if available.");
                    return SpotPublicKeysRefreshService.this.e(deque, true);
                }
            }, a2.e());
        }
        if (z) {
            ((ejhf) ((ejhf) a.i()).ah((char) 4556)).x("Failed refreshing the SPOT public keys cache using all available properly-authenticated accounts. Will try again later.");
            return ensj.i(Integer.valueOf(true != fobb.a.a().D() ? 1 : 2));
        }
        ((ejhf) ((ejhf) a.i()).ah((char) 4555)).x("No user accounts that own SPOT devices were available while refreshing the caches of SPOT public keys.");
        bfcs.h(byjl.a(this));
        return ensj.i(2);
    }

    public SpotPublicKeysRefreshService(bebp bebpVar) {
        this.b = bebpVar.R();
    }
}
