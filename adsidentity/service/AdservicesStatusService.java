package com.google.android.gms.adsidentity.service;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.chimera.modules.adsidentity.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.bzlv;
import defpackage.uzo;
import defpackage.uzr;
import defpackage.uzz;
import defpackage.vaa;
import defpackage.vak;
import defpackage.vaq;
import defpackage.vbf;
import defpackage.vdz;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AdservicesStatusService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private final Context b;
    private final vaq c;
    private final PackageManager d;
    private final bzlv e;
    private final uzr f;
    private final vaa g;
    private final vak h;
    private final uzz j;

    public AdservicesStatusService() {
        Context a2 = AppContextProvider.a();
        this.b = a2;
        vaq vaqVar = new vaq();
        this.c = vaqVar;
        this.d = a2.getPackageManager();
        this.e = vdz.b(a2);
        this.f = new uzr();
        this.g = new vaa();
        this.h = new vak(a2, vaqVar);
        this.j = vaqVar.b(a2);
        uzo.a(a2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:8|(2:10|(5:12|(3:16|(1:(1:19)(1:328))(1:329)|20)|330|(0)(0)|20)(5:331|(3:333|(0)(0)|20)|330|(0)(0)|20))(2:334|(4:336|337|338|20)(1:342))|21|(11:23|(1:25)|26|(1:28)|29|(1:31)|32|(1:34)|35|(1:37)|38)(2:46|(11:48|(1:50)|51|(1:53)|54|(1:56)|57|(1:59)|60|(1:62)|63)(2:64|(11:66|(1:68)|69|(1:71)|72|(1:74)|75|(1:77)|78|(1:80)|81)(4:82|(2:84|(2:86|(11:88|(1:90)|91|(1:93)|94|(1:96)|97|(1:99)|100|(1:102)|103)))(1:327)|104|(11:106|(1:108)|109|(1:111)|112|(1:114)|115|(1:117)|118|(1:120)|121)(6:122|(5:299|300|301|(2:303|(12:306|307|(1:309)|310|(1:312)|313|(1:315)|316|(1:318)|319|(1:321)|322)(1:305))|323)|124|(1:126)|128|(31:148|(1:150)|151|(1:153)|154|(1:156)|157|(1:159)|160|(1:162)|163|(1:165)(1:298)|166|(1:168)|169|(1:171)(1:(1:296)(1:297))|172|(1:174)|175|(1:177)|178|179|180|(1:182)|183|(4:185|(1:187)(2:196|(1:198)(1:199))|188|(3:190|(1:192)(2:193|(1:195))|42))|200|(1:202)(1:266)|203|(4:205|(12:207|(1:209)|210|(1:212)|213|(3:216|(2:218|219)(1:220)|214)|221|222|(1:224)(1:232)|225|(2:228|226)|229)(11:233|234|(2:236|(3:238|239|240))|245|(1:247)(1:265)|248|(1:250)|251|(1:253)(2:262|(1:264))|254|(2:256|(1:261)))|230|231)|42)(11:132|(1:134)|135|(1:137)|138|(1:140)|141|(1:143)|144|(1:146)|147)))))|39|40|41|42) */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0546, code lost:
    
        if (defpackage.vdz.k(r14, r9, r2) != false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0860, code lost:
    
        if (r0.i("eu_device_successfully_called", false) == false) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x060b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x060c, code lost:
    
        r0.getMessage();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0079  */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(defpackage.cauf r24) {
        /*
            Method dump skipped, instructions count: 2534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.adsidentity.service.AdservicesStatusService.a(cauf):int");
    }

    public AdservicesStatusService(Context context, vaq vaqVar, PackageManager packageManager, bzlv bzlvVar, uzr uzrVar, vbf vbfVar, vaa vaaVar, vak vakVar, uzz uzzVar, uzo uzoVar) {
        this.b = context;
        this.c = vaqVar;
        this.d = packageManager;
        this.e = bzlvVar;
        this.f = uzrVar;
        this.g = vaaVar;
        this.h = vakVar;
        this.j = uzzVar;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final void gf() {
    }
}
