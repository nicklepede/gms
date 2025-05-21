package com.google.android.gms.auth.aang.impl.deeplink;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import defpackage.adjl;
import defpackage.adjs;
import defpackage.arke;
import defpackage.asot;
import defpackage.ejhf;
import defpackage.fedh;
import defpackage.fkeq;
import defpackage.fuwt;
import defpackage.fvbo;
import defpackage.fvfj;
import defpackage.qfn;
import defpackage.vbb;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class DeepLinkChimeraActivity extends qfn {
    private final asot h = vbb.a("DeepLinkChimeraActivity");

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        String path;
        super.onCreate(bundle);
        if (fkeq.c()) {
            ((ejhf) this.h.j()).x("DeepLink handling is disabled");
            finish();
            return;
        }
        Uri data = getIntent().getData();
        if (!fvbo.n("android.intent.action.VIEW", getIntent().getAction()) || data == null) {
            ((ejhf) this.h.j()).P("Invalid intent: action=%s, data=%s", getIntent().getAction(), data);
            finish();
            return;
        }
        String uri = data.toString();
        Uri parse = Uri.parse(uri);
        if (fvbo.n(parse.getScheme(), "https") && fkeq.a.a().a().b.contains(parse.getHost()) && (path = parse.getPath()) != null) {
            fedh<String> fedhVar = fkeq.a.a().b().b;
            fvbo.e(fedhVar, "getElementList(...)");
            if (!(fedhVar instanceof Collection) || !fedhVar.isEmpty()) {
                for (String str : fedhVar) {
                    fvbo.c(str);
                    if (fvfj.Q(path, str)) {
                        Uri parse2 = Uri.parse(uri);
                        if (parse2.isHierarchical()) {
                            Set<String> queryParameterNames = parse2.getQueryParameterNames();
                            fvbo.e(queryParameterNames, "getQueryParameterNames(...)");
                            Set<String> aj = fuwt.aj(queryParameterNames);
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
                            fvbo.e(uri, "toString(...)");
                        } else {
                            ((ejhf) this.h.j()).x("updateQueryParam: error parsing url - not hierarchical");
                        }
                        String str3 = uri;
                        Context a = AppContextProvider.a();
                        fvbo.e(a, "getApplicationContext(...)");
                        startActivity(adjs.c.a(a, new adjl("com.google", false, false, false, false, false, arke.b(null), null, null, null, null, null, null, null, false, false, false, false, str3, null, null, 0, false, true)));
                        finish();
                        return;
                    }
                }
            }
        }
        ((ejhf) this.h.j()).B("Invalid url: %s", uri);
        finish();
    }
}
