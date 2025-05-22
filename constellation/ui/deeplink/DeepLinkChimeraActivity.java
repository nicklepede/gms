package com.google.android.gms.constellation.ui.deeplink;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.constellation.ui.deeplink.DeepLinkChimeraActivity;
import defpackage.auad;
import defpackage.avmt;
import defpackage.avmu;
import defpackage.avmv;
import defpackage.avmw;
import defpackage.avmx;
import defpackage.avmz;
import defpackage.avna;
import defpackage.avnb;
import defpackage.avnc;
import defpackage.avnd;
import defpackage.avne;
import defpackage.avnf;
import defpackage.avpz;
import defpackage.avqj;
import defpackage.eqju;
import defpackage.eqke;
import defpackage.eqkg;
import defpackage.fxqu;
import defpackage.fxqx;
import defpackage.fxwd;
import defpackage.fxwo;
import defpackage.fxxg;
import defpackage.fxya;
import defpackage.jxm;
import defpackage.rxx;
import java.util.Map;
import java.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class DeepLinkChimeraActivity extends rxx {
    public static final auad j = avqj.a("c11n_deep_link_activity");

    private static final avnd a(fxqu fxquVar) {
        return (avnd) fxquVar.a();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        Uri data;
        super.onCreate(bundle);
        j.d("onCreate DeepLinkChimeraActivity", new Object[0]);
        setTheme(R.style.Theme_GoogleMaterial_DayNight_NoActionBar);
        setContentView(R.layout.c11n_deeplink_transparent_activity_layout);
        avmt avmtVar = new avmt(this);
        int i = fxya.a;
        jxm jxmVar = new jxm(new fxxg(avnd.class), new avmu(this), avmtVar, new avmv(this));
        Intent intent = getIntent();
        if (intent != null && (data = intent.getData()) != null) {
            avnd a = a(jxmVar);
            Map map = avmz.a;
            fxwd fxwdVar = (fxwd) avmz.a.get(String.valueOf(data.getHost()));
            avmx avmxVar = fxwdVar != null ? (avmx) fxwdVar.a() : null;
            avpz a2 = avpz.a(this);
            if (avmxVar == null) {
                avnd.a.d("Deeplink not handled by DeepLinkHandlerFactory", new Object[0]);
                avnd.a(a2, eqke.FAILURE, eqkg.EXIT, data, eqju.DEEPLINK_HANDLER_NOT_FOUND, null, 32);
                a.b.l(new avnf(avne.b));
            } else {
                avnc a3 = avmxVar.a(data);
                if (a3 instanceof avnb) {
                    eqke eqkeVar = eqke.SUCCESS;
                    eqkg eqkgVar = eqkg.LANDING_PAGE;
                    String str = ((avnb) a3).a;
                    avnd.a(a2, eqkeVar, eqkgVar, data, null, str, 16);
                    a.b.l(new avnf(avne.a, str));
                } else {
                    if (!(a3 instanceof avna)) {
                        throw new fxqx();
                    }
                    eqju eqjuVar = ((avna) a3).a;
                    auad auadVar = avnd.a;
                    Objects.toString(eqjuVar);
                    auadVar.d("Deeplink not handled by DeepLinkHandler: ".concat(String.valueOf(eqjuVar)), new Object[0]);
                    avnd.a(a2, eqke.FAILURE, eqkg.EXIT, data, eqjuVar, null, 32);
                    a.b.l(new avnf(avne.b));
                }
            }
        }
        a(jxmVar).c.g(this, new avmw(new fxwo() { // from class: avms
            @Override // defpackage.fxwo
            public final Object a(Object obj) {
                avnf avnfVar = (avnf) obj;
                int ordinal = avnfVar.a.ordinal();
                DeepLinkChimeraActivity deepLinkChimeraActivity = DeepLinkChimeraActivity.this;
                if (ordinal == 0) {
                    String str2 = avnfVar.b;
                    if (str2 != null) {
                        auad auadVar2 = DeepLinkChimeraActivity.j;
                        auadVar2.d("getLaunchIntent ".concat(str2), new Object[0]);
                        Intent data2 = new Intent().setClassName(deepLinkChimeraActivity, "com.google.android.gms.constellation.ui.deeplink.web.WebEntryPointActivity").setData(Uri.parse(str2));
                        fxxm.e(data2, "setData(...)");
                        Objects.toString(data2);
                        auadVar2.d("launchPage ".concat(String.valueOf(data2)), new Object[0]);
                        deepLinkChimeraActivity.startActivity(data2);
                        deepLinkChimeraActivity.finish();
                    }
                } else {
                    if (ordinal != 1) {
                        throw new fxqx();
                    }
                    deepLinkChimeraActivity.finish();
                }
                return fxrq.a;
            }
        }));
    }
}
