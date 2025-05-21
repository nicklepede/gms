package com.google.android.gms.adsidentity.service;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.chimera.modules.adsidentity.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.bxdf;
import defpackage.tdo;
import defpackage.tdr;
import defpackage.tdz;
import defpackage.tea;
import defpackage.tek;
import defpackage.teq;
import defpackage.tff;
import defpackage.thz;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AdservicesStatusService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private final Context b;
    private final teq c;
    private final PackageManager d;
    private final bxdf e;
    private final tdr f;
    private final tea g;
    private final tek h;
    private final tdz j;

    public AdservicesStatusService() {
        Context a2 = AppContextProvider.a();
        this.b = a2;
        teq teqVar = new teq();
        this.c = teqVar;
        this.d = a2.getPackageManager();
        this.e = thz.b(a2);
        this.f = new tdr();
        this.g = new tea();
        this.h = new tek(a2, teqVar);
        this.j = teqVar.b(a2);
        tdo.a(a2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:8|(2:10|(5:12|(3:16|(1:(1:19)(1:332))(1:333)|20)|334|(0)(0)|20)(5:335|(3:337|(0)(0)|20)|334|(0)(0)|20))(2:338|(4:340|341|342|20)(1:346))|21|(11:23|(1:25)|26|(1:28)|29|(1:31)|32|(1:34)|35|(1:37)|38)(2:46|(11:48|(1:50)|51|(1:53)|54|(1:56)|57|(1:59)|60|(1:62)|63)(2:64|(11:66|(1:68)|69|(1:71)|72|(1:74)|75|(1:77)|78|(1:80)|81)(4:82|(2:84|(2:86|(11:88|(1:90)|91|(1:93)|94|(1:96)|97|(1:99)|100|(1:102)|103)))(1:331)|104|(11:106|(1:108)|109|(1:111)|112|(1:114)|115|(1:117)|118|(1:120)|121)(6:122|(5:303|304|305|(2:307|(12:310|311|(1:313)|314|(1:316)|317|(1:319)|320|(1:322)|323|(1:325)|326)(1:309))|327)|124|(1:126)|128|(31:148|(1:150)|151|(1:153)|154|(1:156)|157|(1:159)|160|(1:162)|163|(1:165)(1:302)|166|(1:168)|169|(1:171)(1:(1:300)(1:301))|172|(1:174)|175|(1:177)|178|179|180|(1:182)|183|(4:185|(1:187)(2:196|(1:198)(1:199))|188|(3:190|(1:192)(2:193|(1:195))|42))|200|(1:202)(1:270)|203|(4:205|(12:207|(1:209)|210|(1:212)|213|(3:216|(2:218|219)(1:220)|214)|221|222|(1:234)(1:226)|227|(2:230|228)|231)(11:235|236|(2:238|(3:240|241|242))|247|(1:269)(1:251)|252|(1:254)|255|(1:257)(2:266|(1:268))|258|(2:260|(1:265)))|232|233)|42)(11:132|(1:134)|135|(1:137)|138|(1:140)|141|(1:143)|144|(1:146)|147)))))|39|40|41|42) */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0548, code lost:
    
        if (defpackage.thz.k(r14, r12, r2) != false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0868, code lost:
    
        if (r0.i("eu_device_successfully_called", false) == false) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x060d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x060e, code lost:
    
        r0.getMessage();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x007b  */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(defpackage.byln r24) {
        /*
            Method dump skipped, instructions count: 2552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.adsidentity.service.AdservicesStatusService.a(byln):int");
    }

    public AdservicesStatusService(Context context, teq teqVar, PackageManager packageManager, bxdf bxdfVar, tdr tdrVar, tff tffVar, tea teaVar, tek tekVar, tdz tdzVar, tdo tdoVar) {
        this.b = context;
        this.c = teqVar;
        this.d = packageManager;
        this.e = bxdfVar;
        this.f = tdrVar;
        this.g = teaVar;
        this.h = tekVar;
        this.j = tdzVar;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final void fR() {
    }
}
