package com.google.android.gms.constellation.ui.deeplink;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.constellation.ui.deeplink.DeepLinkChimeraActivity;
import defpackage.arxo;
import defpackage.atiq;
import defpackage.atir;
import defpackage.atis;
import defpackage.atit;
import defpackage.atiu;
import defpackage.atiw;
import defpackage.atix;
import defpackage.atiy;
import defpackage.atiz;
import defpackage.atja;
import defpackage.atjb;
import defpackage.atjc;
import defpackage.atlw;
import defpackage.atmg;
import defpackage.enwb;
import defpackage.enwl;
import defpackage.enwn;
import defpackage.fuuw;
import defpackage.fuuz;
import defpackage.fvaf;
import defpackage.fvaq;
import defpackage.fvbi;
import defpackage.fvcc;
import defpackage.jqx;
import defpackage.qet;
import java.util.Map;
import java.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class DeepLinkChimeraActivity extends qet {
    public static final arxo j = atmg.a("c11n_deep_link_activity");

    private static final atja a(fuuw fuuwVar) {
        return (atja) fuuwVar.a();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        Uri data;
        super.onCreate(bundle);
        j.d("onCreate DeepLinkChimeraActivity", new Object[0]);
        setTheme(R.style.Theme_GoogleMaterial_DayNight_NoActionBar);
        setContentView(R.layout.c11n_deeplink_transparent_activity_layout);
        atiq atiqVar = new atiq(this);
        int i = fvcc.a;
        jqx jqxVar = new jqx(new fvbi(atja.class), new atir(this), atiqVar, new atis(this));
        Intent intent = getIntent();
        if (intent != null && (data = intent.getData()) != null) {
            atja a = a(jqxVar);
            Map map = atiw.a;
            fvaf fvafVar = (fvaf) atiw.a.get(String.valueOf(data.getHost()));
            atiu atiuVar = fvafVar != null ? (atiu) fvafVar.a() : null;
            atlw a2 = atlw.a(this);
            if (atiuVar == null) {
                atja.a.d("Deeplink not handled by DeepLinkHandlerFactory", new Object[0]);
                atja.a(a2, enwl.FAILURE, enwn.EXIT, data, enwb.DEEPLINK_HANDLER_NOT_FOUND, null, 32);
                a.b.l(new atjc(atjb.b));
            } else {
                atiz a3 = atiuVar.a(data);
                if (a3 instanceof atiy) {
                    enwl enwlVar = enwl.SUCCESS;
                    enwn enwnVar = enwn.LANDING_PAGE;
                    String str = ((atiy) a3).a;
                    atja.a(a2, enwlVar, enwnVar, data, null, str, 16);
                    a.b.l(new atjc(atjb.a, str));
                } else {
                    if (!(a3 instanceof atix)) {
                        throw new fuuz();
                    }
                    enwb enwbVar = ((atix) a3).a;
                    arxo arxoVar = atja.a;
                    Objects.toString(enwbVar);
                    arxoVar.d("Deeplink not handled by DeepLinkHandler: ".concat(String.valueOf(enwbVar)), new Object[0]);
                    atja.a(a2, enwl.FAILURE, enwn.EXIT, data, enwbVar, null, 32);
                    a.b.l(new atjc(atjb.b));
                }
            }
        }
        a(jqxVar).c.g(this, new atit(new fvaq() { // from class: atip
            @Override // defpackage.fvaq
            public final Object a(Object obj) {
                atjc atjcVar = (atjc) obj;
                int ordinal = atjcVar.a.ordinal();
                DeepLinkChimeraActivity deepLinkChimeraActivity = DeepLinkChimeraActivity.this;
                if (ordinal == 0) {
                    String str2 = atjcVar.b;
                    if (str2 != null) {
                        arxo arxoVar2 = DeepLinkChimeraActivity.j;
                        arxoVar2.d("getLaunchIntent ".concat(str2), new Object[0]);
                        Intent data2 = new Intent().setClassName(deepLinkChimeraActivity, "com.google.android.gms.constellation.ui.deeplink.web.WebEntryPointActivity").setData(Uri.parse(str2));
                        fvbo.e(data2, "setData(...)");
                        Objects.toString(data2);
                        arxoVar2.d("launchPage ".concat(String.valueOf(data2)), new Object[0]);
                        deepLinkChimeraActivity.startActivity(data2);
                        deepLinkChimeraActivity.finish();
                    }
                } else {
                    if (ordinal != 1) {
                        throw new fuuz();
                    }
                    deepLinkChimeraActivity.finish();
                }
                return fuvs.a;
            }
        }));
    }
}
