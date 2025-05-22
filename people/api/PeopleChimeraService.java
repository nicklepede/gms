package com.google.android.gms.people.api;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.auid;
import defpackage.aupz;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.bzps;
import defpackage.cvtz;
import defpackage.cwli;
import defpackage.cwlq;
import defpackage.cwof;
import defpackage.cwpy;
import defpackage.cxoi;
import defpackage.cxoj;
import defpackage.ekvh;
import defpackage.elgx;
import defpackage.fubp;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PeopleChimeraService extends bzot {
    public PeopleChimeraService() {
        super(new int[]{5, AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_EMAIL_ADDRESS}, new String[]{"com.google.android.gms.people.service.START", "com.google.android.gms.people.contactssync.service.START"}, Collections.EMPTY_SET, 1, new aupz((int) fubp.a.lK().I(), 9), (elgx) null);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzps cwpyVar;
        String str;
        cwof.j("PeopleChimeraService", "onService. callbacks = %s, request = %s", bzozVar, getServiceRequest);
        if (getServiceRequest.e <= 0) {
            throw new IllegalArgumentException("clientVersion too old");
        }
        if (((auid) ekvh.c(auid.b(getServiceRequest.d), auid.UNKNOWN)).ordinal() != 210) {
            String str2 = getServiceRequest.f;
            Bundle bundle = getServiceRequest.i;
            String string = bundle == null ? null : bundle.getString("social_client_application_id");
            if (TextUtils.isEmpty(string)) {
                Integer num = (Integer) cxoj.a.get(str2);
                String num2 = num != null ? num.toString() : null;
                if (!TextUtils.isEmpty(num2)) {
                    str = num2;
                    String string2 = bundle.getString("real_client_package_name");
                    boolean z = bundle.getBoolean("support_new_image_callback", false);
                    bundle.getString("social_client_application_id");
                    cwpyVar = new cwlq(this, l(), str2, string2, str, z, bzozVar.f(), Binder.getCallingUid(), getServiceRequest.p);
                } else {
                    if (!fubp.a.lK().af()) {
                        throw new IllegalArgumentException("Please use new constructor and specify app ID.  Talk to the team");
                    }
                    cwof.n("PeopleChimeraService", "%s: package=%s", "Please use new constructor and specify app ID.  Talk to the team", str2);
                    string = "0";
                }
            }
            str = string;
            String string22 = bundle.getString("real_client_package_name");
            boolean z2 = bundle.getBoolean("support_new_image_callback", false);
            bundle.getString("social_client_application_id");
            cwpyVar = new cwlq(this, l(), str2, string22, str, z2, bzozVar.f(), Binder.getCallingUid(), getServiceRequest.p);
        } else {
            cwpyVar = new cwpy(this, l(), cwli.a, bzozVar.f(), getServiceRequest.f, getServiceRequest.p);
        }
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = new Bundle();
        String[] strArr = cxoi.b;
        String[] strArr2 = cxoi.c;
        bundle3.putStringArray("config.url_uncompress.patterns", strArr);
        bundle3.putStringArray("config.url_uncompress.replacements", strArr2);
        Binder.restoreCallingIdentity(Binder.clearCallingIdentity());
        bundle3.putBoolean("use_contactables_api", true);
        cvtz.a(this);
        bundle3.putBundle("config.email_type_map", cvtz.a);
        cvtz.a(this);
        bundle3.putBundle("config.phone_type_map", cvtz.b);
        bundle2.putBundle("post_init_configuration", bundle3);
        bundle2.putBundle("post_init_resolution", new Bundle());
        bzozVar.d(cwpyVar, bundle2);
    }
}
