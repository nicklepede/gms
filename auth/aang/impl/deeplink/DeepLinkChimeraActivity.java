package com.google.android.gms.auth.aang.impl.deeplink;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import defpackage.afjs;
import defpackage.afjz;
import defpackage.atmt;
import defpackage.ausn;
import defpackage.eluo;
import defpackage.fgsa;
import defpackage.fmvc;
import defpackage.fxsr;
import defpackage.fxxm;
import defpackage.fybh;
import defpackage.ryr;
import defpackage.wxb;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class DeepLinkChimeraActivity extends ryr {
    private final ausn h = wxb.a("DeepLinkChimeraActivity");

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        String path;
        super.onCreate(bundle);
        if (fmvc.c()) {
            ((eluo) this.h.j()).x("DeepLink handling is disabled");
            finish();
            return;
        }
        Uri data = getIntent().getData();
        if (!fxxm.n("android.intent.action.VIEW", getIntent().getAction()) || data == null) {
            ((eluo) this.h.j()).P("Invalid intent: action=%s, data=%s", getIntent().getAction(), data);
            finish();
            return;
        }
        String uri = data.toString();
        Uri parse = Uri.parse(uri);
        if (fxxm.n(parse.getScheme(), "https")) {
            fmvc fmvcVar = fmvc.a;
            if (fmvcVar.lK().a().b.contains(parse.getHost()) && (path = parse.getPath()) != null) {
                fgsa<String> fgsaVar = fmvcVar.lK().b().b;
                fxxm.e(fgsaVar, "getElementList(...)");
                if (!(fgsaVar instanceof Collection) || !fgsaVar.isEmpty()) {
                    for (String str : fgsaVar) {
                        fxxm.c(str);
                        if (fybh.Q(path, str)) {
                            Uri parse2 = Uri.parse(uri);
                            if (parse2.isHierarchical()) {
                                Set<String> queryParameterNames = parse2.getQueryParameterNames();
                                fxxm.e(queryParameterNames, "getQueryParameterNames(...)");
                                Set<String> aj = fxsr.aj(queryParameterNames);
                                if (aj.contains("flow")) {
                                    aj.remove("flow");
                                }
                                Uri.Builder clearQuery = parse2.buildUpon().clearQuery();
                                for (String str2 : aj) {
                                    Iterator<String> it = parse2.getQueryParameters(str2).iterator();
                                    while (it.hasNext()) {
                                        clearQuery.appendQueryParameter(str2, it.next());
                                    }
                                }
                                clearQuery.appendQueryParameter("flow", "android");
                                uri = clearQuery.build().toString();
                                fxxm.e(uri, "toString(...)");
                            } else {
                                ((eluo) this.h.j()).x("updateQueryParam: error parsing url - not hierarchical");
                            }
                            String str3 = uri;
                            Context a = AppContextProvider.a();
                            fxxm.e(a, "getApplicationContext(...)");
                            startActivity(afjz.c.a(a, new afjs("com.google", false, false, false, false, false, atmt.b(null), null, null, null, null, null, null, null, false, false, false, false, str3, null, null, 0, false, true)));
                            finish();
                            return;
                        }
                    }
                }
            }
        }
        ((eluo) this.h.j()).B("Invalid url: %s", uri);
        finish();
    }
}
