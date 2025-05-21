package com.google.android.gms.people.api;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.asej;
import defpackage.asmf;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.bxhc;
import defpackage.ctkt;
import defpackage.cucb;
import defpackage.cucj;
import defpackage.cuey;
import defpackage.cugr;
import defpackage.cvez;
import defpackage.cvfa;
import defpackage.eiic;
import defpackage.eits;
import defpackage.frhu;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class PeopleChimeraService extends bxgd {
    public PeopleChimeraService() {
        super(new int[]{5, AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_EMAIL_ADDRESS}, new String[]{"com.google.android.gms.people.service.START", "com.google.android.gms.people.contactssync.service.START"}, Collections.EMPTY_SET, 1, new asmf((int) frhu.a.a().I(), 9), (eits) null);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxhc cugrVar;
        String str;
        cuey.j("PeopleChimeraService", "onService. callbacks = %s, request = %s", bxgjVar, getServiceRequest);
        if (getServiceRequest.e <= 0) {
            throw new IllegalArgumentException("clientVersion too old");
        }
        if (((asej) eiic.c(asej.b(getServiceRequest.d), asej.UNKNOWN)).ordinal() != 210) {
            String str2 = getServiceRequest.f;
            Bundle bundle = getServiceRequest.i;
            String string = bundle == null ? null : bundle.getString("social_client_application_id");
            if (TextUtils.isEmpty(string)) {
                Integer num = (Integer) cvfa.a.get(str2);
                String num2 = num != null ? num.toString() : null;
                if (!TextUtils.isEmpty(num2)) {
                    str = num2;
                    String string2 = bundle.getString("real_client_package_name");
                    boolean z = bundle.getBoolean("support_new_image_callback", false);
                    bundle.getString("social_client_application_id");
                    cugrVar = new cucj(this, l(), str2, string2, str, z, bxgjVar.f(), Binder.getCallingUid(), getServiceRequest.p);
                } else {
                    if (!frhu.a.a().af()) {
                        throw new IllegalArgumentException("Please use new constructor and specify app ID.  Talk to the team");
                    }
                    cuey.n("PeopleChimeraService", "%s: package=%s", "Please use new constructor and specify app ID.  Talk to the team", str2);
                    string = "0";
                }
            }
            str = string;
            String string22 = bundle.getString("real_client_package_name");
            boolean z2 = bundle.getBoolean("support_new_image_callback", false);
            bundle.getString("social_client_application_id");
            cugrVar = new cucj(this, l(), str2, string22, str, z2, bxgjVar.f(), Binder.getCallingUid(), getServiceRequest.p);
        } else {
            cugrVar = new cugr(this, l(), cucb.a, bxgjVar.f(), getServiceRequest.f, getServiceRequest.p);
        }
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = new Bundle();
        String[] strArr = cvez.b;
        String[] strArr2 = cvez.c;
        bundle3.putStringArray("config.url_uncompress.patterns", strArr);
        bundle3.putStringArray("config.url_uncompress.replacements", strArr2);
        Binder.restoreCallingIdentity(Binder.clearCallingIdentity());
        bundle3.putBoolean("use_contactables_api", true);
        ctkt.a(this);
        bundle3.putBundle("config.email_type_map", ctkt.a);
        ctkt.a(this);
        bundle3.putBundle("config.phone_type_map", ctkt.b);
        bundle2.putBundle("post_init_configuration", bundle3);
        bundle2.putBundle("post_init_resolution", new Bundle());
        bxgjVar.d(cugrVar, bundle2);
    }
}
