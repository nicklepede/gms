package com.google.android.gms.people.service.wipeout;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bsup;
import defpackage.cauf;
import defpackage.cwli;
import defpackage.cwlj;
import defpackage.dzng;
import defpackage.dznn;
import defpackage.dzno;
import defpackage.dznq;
import defpackage.dznr;
import defpackage.eluo;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class PeopleAndroidUriWipeoutTask extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private static final ausn b = ausn.b("AndroidUriWipeoutSvc", auid.PEOPLE);

    public static int d() {
        cwlj cwljVar = cwli.a;
        Context context = (Context) cwljVar.b.a();
        dzng dzngVar = (dzng) cwljVar.h.a();
        Pattern pattern = dzno.a;
        dznn dznnVar = new dznn(context);
        dznnVar.j();
        dznnVar.e("people");
        Uri a2 = dznnVar.a();
        List asList = Arrays.asList(bsup.b(context).p("com.google"));
        dznq dznqVar = new dznq();
        dznqVar.a = dzngVar;
        dznqVar.c(a2);
        dznqVar.b(asList);
        dznr a3 = dznqVar.a();
        try {
            ((eluo) ((eluo) b.h()).ai(8341)).x("Running AndroidUriWipeout");
            a3.a();
            return 0;
        } catch (IOException e) {
            ((eluo) ((eluo) ((eluo) b.i()).s(e)).ai((char) 8342)).x("Wipeout failed.");
            return 2;
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        return d();
    }
}
