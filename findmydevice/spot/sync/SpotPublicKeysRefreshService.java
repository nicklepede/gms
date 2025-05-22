package com.google.android.gms.findmydevice.spot.sync;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.findmydevice.spot.sync.SpotPublicKeysRefreshService;
import com.google.android.gms.findmydevice.util.SafeGmsTaskBoundService;
import defpackage.auid;
import defpackage.auqx;
import defpackage.ausn;
import defpackage.bfad;
import defpackage.bgcq;
import defpackage.bgcr;
import defpackage.bgda;
import defpackage.bgdb;
import defpackage.bhei;
import defpackage.bhfh;
import defpackage.casd;
import defpackage.cauf;
import defpackage.ejaa;
import defpackage.eluo;
import defpackage.eqdv;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.fqsv;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class SpotPublicKeysRefreshService extends SafeGmsTaskBoundService {
    public static final ausn a = ausn.b("SpotPublicKeysRfrshSvc", auid.FIND_MY_DEVICE_SPOT);
    private final bgcq b;

    public SpotPublicKeysRefreshService() {
        this(bgda.a());
    }

    @Override // com.google.android.gms.findmydevice.util.SafeGmsTaskBoundService
    protected final eqgl d(cauf caufVar) {
        if (!bhfh.a()) {
            ((eluo) ((eluo) a.j()).ai((char) 4564)).x("Eddystone use cases are disabled.");
            return eqgc.i(2);
        }
        Context baseContext = getBaseContext();
        ArrayDeque arrayDeque = new ArrayDeque(auqx.h(baseContext, baseContext.getPackageName()));
        if (!arrayDeque.isEmpty()) {
            return e(arrayDeque, false);
        }
        ((eluo) ((eluo) a.i()).ai((char) 4563)).x("No user accounts were available while refreshing the caches of SPOT public keys.");
        bhei.h(casd.a(this));
        return eqgc.i(2);
    }

    public final eqgl e(final Deque deque, final boolean z) {
        if (!deque.isEmpty()) {
            final bgcr a2 = this.b.a((Account) deque.removeFirst());
            return ejaa.g(a2.c().e()).i(new eqdv() { // from class: bher
                @Override // defpackage.eqdv
                public final eqgl a(Object obj) {
                    if (!((Boolean) obj).booleanValue()) {
                        return SpotPublicKeysRefreshService.this.e(deque, z);
                    }
                    bgcr bgcrVar = a2;
                    Context b = bgcw.b();
                    bgda bgdaVar = bgcrVar.j;
                    dztm dztmVar = (dztm) bgdaVar.p.a();
                    boolean z2 = bgdaVar.a.b;
                    dyqq b2 = bezz.b(bfaa.b(b, dztmVar), new bezw(bgcrVar.f()), (dpvo) bgdaVar.e.a(), bgda.W(), (Executor) bgdaVar.b.a());
                    return ejad.h(ejaa.g(b2.a(true)).h(new ekut() { // from class: dyqn
                        @Override // defpackage.ekut
                        public final Object apply(Object obj2) {
                            return null;
                        }
                    }, b2.d)).a(new Callable() { // from class: bheu
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            ausn ausnVar = SpotPublicKeysRefreshService.a;
                            return 0;
                        }
                    }, eqex.a);
                }
            }, a2.e()).f(bfad.class, new eqdv() { // from class: bhes
                @Override // defpackage.eqdv
                public final eqgl a(Object obj) {
                    bfad bfadVar = (bfad) obj;
                    if (bfadVar.d()) {
                        return eqgc.h(bfadVar);
                    }
                    Deque deque2 = deque;
                    SpotPublicKeysRefreshService spotPublicKeysRefreshService = SpotPublicKeysRefreshService.this;
                    ((eluo) ((eluo) ((eluo) SpotPublicKeysRefreshService.a.j()).s(bfadVar)).ai((char) 4561)).x("Failed refreshing the SPOT public keys cache because the account was unauthenticated. Will try again with another account, if available.");
                    return spotPublicKeysRefreshService.e(deque2, false);
                }
            }, a2.e()).f(Throwable.class, new eqdv() { // from class: bhet
                @Override // defpackage.eqdv
                public final eqgl a(Object obj) {
                    ((eluo) ((eluo) ((eluo) SpotPublicKeysRefreshService.a.j()).s((Throwable) obj)).ai((char) 4562)).x("Failed refreshing the SPOT public keys cache. Will try again with another account, if available.");
                    return SpotPublicKeysRefreshService.this.e(deque, true);
                }
            }, a2.e());
        }
        if (z) {
            ((eluo) ((eluo) a.i()).ai((char) 4566)).x("Failed refreshing the SPOT public keys cache using all available properly-authenticated accounts. Will try again later.");
            return eqgc.i(Integer.valueOf(true != fqsv.a.lK().D() ? 1 : 2));
        }
        ((eluo) ((eluo) a.i()).ai((char) 4565)).x("No user accounts that own SPOT devices were available while refreshing the caches of SPOT public keys.");
        bhei.h(casd.a(this));
        return eqgc.i(2);
    }

    public SpotPublicKeysRefreshService(bgdb bgdbVar) {
        this.b = bgdbVar.R();
    }
}
