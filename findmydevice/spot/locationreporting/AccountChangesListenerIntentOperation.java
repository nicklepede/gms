package com.google.android.gms.findmydevice.spot.locationreporting;

import android.content.Context;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.findmydevice.spot.locationreporting.AccountChangesListenerIntentOperation;
import defpackage.asej;
import defpackage.asot;
import defpackage.bebm;
import defpackage.bebo;
import defpackage.bebp;
import defpackage.belk;
import defpackage.bffp;
import defpackage.byjl;
import defpackage.dwwv;
import defpackage.fuuq;
import defpackage.iru;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class AccountChangesListenerIntentOperation extends IntentOperation {
    public static final asot a = asot.b("AccountChangesIntOp", asej.FIND_MY_DEVICE_SPOT);
    public final bebm b;
    public final byjl c;
    public final Executor d;
    private final belk e;
    private final fuuq f;
    private final Context g;
    private final iru h;
    private final bffp i;
    private final dwwv j;

    public AccountChangesListenerIntentOperation() {
        this(bebo.a(), new iru() { // from class: beif
            @Override // defpackage.iru
            public final void a(Object obj) {
                Object dxblVar;
                eiuu eiuuVar = (eiuu) obj;
                asot asotVar = AccountChangesListenerIntentOperation.a;
                try {
                    bebo.a();
                    Context b = bebk.b();
                    dxbq dxbqVar = new dxbq();
                    if (fmut.f()) {
                        dxbk dxbkVar = new dxbk(b);
                        dxbkVar.d = bxfi.a;
                        dxblVar = new bquz(new dxbl(dxbkVar));
                    } else {
                        dxbk dxbkVar2 = new dxbk(b);
                        dxbkVar2.d = bxfi.a;
                        dxblVar = new dxbl(dxbkVar2);
                    }
                    dxbqVar.a = new dxbg(eitj.l(dxblVar));
                    Pattern pattern = dxbo.a;
                    dxbn dxbnVar = new dxbn(b);
                    dxbnVar.j();
                    dxbnVar.e("findmydevice");
                    dxbqVar.c(dxbnVar.a());
                    dxbqVar.b(eiuuVar);
                    dxbqVar.a().a();
                } catch (IOException e) {
                    ((ejhf) ((ejhf) ((ejhf) AccountChangesListenerIntentOperation.a.i()).s(e)).ah((char) 4216)).x("Error removing removed accounts data.");
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

    public AccountChangesListenerIntentOperation(bebp bebpVar, iru iruVar) {
        this.e = bebpVar.o();
        this.f = bebpVar.O();
        this.b = bebpVar.i();
        Context c = bebpVar.c();
        this.g = c;
        this.c = byjl.a(c);
        this.d = bebpVar.G();
        this.i = bebpVar.A();
        this.j = bebpVar.F();
        this.h = iruVar;
    }
}
