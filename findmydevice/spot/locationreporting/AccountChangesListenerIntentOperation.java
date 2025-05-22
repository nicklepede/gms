package com.google.android.gms.findmydevice.spot.locationreporting;

import android.content.Context;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.findmydevice.spot.locationreporting.AccountChangesListenerIntentOperation;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bgcy;
import defpackage.bgda;
import defpackage.bgdb;
import defpackage.bgmw;
import defpackage.bhhf;
import defpackage.casd;
import defpackage.dziv;
import defpackage.fxqo;
import defpackage.itk;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class AccountChangesListenerIntentOperation extends IntentOperation {
    public static final ausn a = ausn.b("AccountChangesIntOp", auid.FIND_MY_DEVICE_SPOT);
    public final bgcy b;
    public final casd c;
    public final Executor d;
    private final bgmw e;
    private final fxqo f;
    private final Context g;
    private final itk h;
    private final bhhf i;
    private final dziv j;

    public AccountChangesListenerIntentOperation() {
        this(bgda.a(), new itk() { // from class: bgjr
            @Override // defpackage.itk
            public final void a(Object obj) {
                Object dznlVar;
                elhz elhzVar = (elhz) obj;
                ausn ausnVar = AccountChangesListenerIntentOperation.a;
                try {
                    bgda.a();
                    Context b = bgcw.b();
                    dznq dznqVar = new dznq();
                    if (fpmr.f()) {
                        dznk dznkVar = new dznk(b);
                        dznkVar.d = bzny.a;
                        dznlVar = new btcq(new dznl(dznkVar));
                    } else {
                        dznk dznkVar2 = new dznk(b);
                        dznkVar2.d = bzny.a;
                        dznlVar = new dznl(dznkVar2);
                    }
                    dznqVar.a = new dzng(elgo.l(dznlVar));
                    Pattern pattern = dzno.a;
                    dznn dznnVar = new dznn(b);
                    dznnVar.j();
                    dznnVar.e("findmydevice");
                    dznqVar.c(dznnVar.a());
                    dznqVar.b(elhzVar);
                    dznqVar.a().a();
                } catch (IOException e) {
                    ((eluo) ((eluo) ((eluo) AccountChangesListenerIntentOperation.a.i()).s(e)).ai((char) 4222)).x("Error removing removed accounts data.");
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.chimera.IntentOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleIntent(android.content.Intent r13) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.findmydevice.spot.locationreporting.AccountChangesListenerIntentOperation.onHandleIntent(android.content.Intent):void");
    }

    public AccountChangesListenerIntentOperation(bgdb bgdbVar, itk itkVar) {
        this.e = bgdbVar.o();
        this.f = bgdbVar.O();
        this.b = bgdbVar.i();
        Context c = bgdbVar.c();
        this.g = c;
        this.c = casd.a(c);
        this.d = bgdbVar.G();
        this.i = bgdbVar.A();
        this.j = bgdbVar.F();
        this.h = itkVar;
    }
}
