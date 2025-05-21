package com.google.android.gms.mdi.mobstore;

import android.content.Context;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.mdi.mobstore.MobStoreFileService;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.aqup;
import defpackage.asej;
import defpackage.asng;
import defpackage.asot;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.ccjb;
import defpackage.cckw;
import defpackage.cckx;
import defpackage.ccld;
import defpackage.cesx;
import defpackage.dqmv;
import defpackage.dxbg;
import defpackage.dxbk;
import defpackage.dxbl;
import defpackage.dxbn;
import defpackage.dxbo;
import defpackage.dxcb;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.ejhf;
import defpackage.fpbw;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class MobStoreFileService extends bxgd {
    private static final asot b = asot.b("MobStoreFileService", asej.MOBSTORE_FILE);
    public Context a;
    private cckw c;

    public MobStoreFileService() {
        super(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_EDIT_TEXT, "com.google.android.mobstore.service.START", Collections.EMPTY_SET, 3, 9);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        if (!fpbw.a.a().v()) {
            ((ejhf) ((ejhf) b.h()).ah((char) 6329)).x("is disabled");
            bxgjVar.a(16, null);
            return;
        }
        String str = getServiceRequest.f;
        ccld ccldVar = new ccld(eijy.a(new eijr() { // from class: cclb
            @Override // defpackage.eijr
            public final Object a() {
                return MobStoreFileService.this.a.getPackageManager();
            }
        }), str, asng.X(this.a) ? 0 : aqup.d(this.a).h(str) ? 1 : 2);
        Context context = this.a;
        Pattern pattern = dxbo.a;
        dxbn dxbnVar = new dxbn(context);
        dxbnVar.e("mobstore");
        dxbnVar.f("mobstore_accounts.pb");
        bxgjVar.c(new cesx(l(), this.c, ccldVar, new dxcb(new dxbg(Arrays.asList(new dxbl(new dxbk(this.a)))), dxbnVar.a()), str, getServiceRequest.p));
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        this.a = getApplicationContext();
        Context context = this.a;
        this.c = new cckx(context, new dqmv(context), ccjb.a(this.a));
    }
}
