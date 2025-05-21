package com.google.android.gms.people.service.wipeout;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asej;
import defpackage.asot;
import defpackage.bqna;
import defpackage.byln;
import defpackage.cucb;
import defpackage.cucc;
import defpackage.dxbg;
import defpackage.dxbn;
import defpackage.dxbo;
import defpackage.dxbq;
import defpackage.dxbr;
import defpackage.ejhf;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class PeopleAndroidUriWipeoutTask extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private static final asot b = asot.b("AndroidUriWipeoutSvc", asej.PEOPLE);

    public static int d() {
        cucc cuccVar = cucb.a;
        Context context = (Context) cuccVar.b.a();
        dxbg dxbgVar = (dxbg) cuccVar.h.a();
        Pattern pattern = dxbo.a;
        dxbn dxbnVar = new dxbn(context);
        dxbnVar.j();
        dxbnVar.e("people");
        Uri a2 = dxbnVar.a();
        List asList = Arrays.asList(bqna.b(context).p("com.google"));
        dxbq dxbqVar = new dxbq();
        dxbqVar.a = dxbgVar;
        dxbqVar.c(a2);
        dxbqVar.b(asList);
        dxbr a3 = dxbqVar.a();
        try {
            ((ejhf) ((ejhf) b.h()).ah(8388)).x("Running AndroidUriWipeout");
            a3.a();
            return 0;
        } catch (IOException e) {
            ((ejhf) ((ejhf) ((ejhf) b.i()).s(e)).ah((char) 8389)).x("Wipeout failed.");
            return 2;
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        return d();
    }
}
