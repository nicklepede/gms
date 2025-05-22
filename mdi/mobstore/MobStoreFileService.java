package com.google.android.gms.mdi.mobstore;

import android.content.Context;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.mdi.mobstore.MobStoreFileService;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.asxe;
import defpackage.auid;
import defpackage.aura;
import defpackage.ausn;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.cerv;
import defpackage.cetq;
import defpackage.cetr;
import defpackage.cetx;
import defpackage.chcf;
import defpackage.dsxd;
import defpackage.dzng;
import defpackage.dznk;
import defpackage.dznl;
import defpackage.dznn;
import defpackage.dzno;
import defpackage.dzob;
import defpackage.ekww;
import defpackage.ekxd;
import defpackage.eluo;
import defpackage.frvd;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class MobStoreFileService extends bzot {
    private static final ausn b = ausn.b("MobStoreFileService", auid.MOBSTORE_FILE);
    public Context a;
    private cetq c;

    public MobStoreFileService() {
        super(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_EDIT_TEXT, "com.google.android.mobstore.service.START", Collections.EMPTY_SET, 3, 9);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        if (!frvd.a.lK().v()) {
            ((eluo) ((eluo) b.h()).ai((char) 6348)).x("is disabled");
            bzozVar.a(16, null);
            return;
        }
        String str = getServiceRequest.f;
        cetx cetxVar = new cetx(ekxd.a(new ekww() { // from class: cetv
            @Override // defpackage.ekww
            public final Object lK() {
                return MobStoreFileService.this.a.getPackageManager();
            }
        }), str, aura.X(this.a) ? 0 : asxe.d(this.a).h(str) ? 1 : 2);
        Context context = this.a;
        Pattern pattern = dzno.a;
        dznn dznnVar = new dznn(context);
        dznnVar.e("mobstore");
        dznnVar.f("mobstore_accounts.pb");
        bzozVar.c(new chcf(l(), this.c, cetxVar, new dzob(new dzng(Arrays.asList(new dznl(new dznk(this.a)))), dznnVar.a()), str, getServiceRequest.p));
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        this.a = getApplicationContext();
        Context context = this.a;
        this.c = new cetr(context, new dsxd(context), cerv.a(this.a));
    }
}
