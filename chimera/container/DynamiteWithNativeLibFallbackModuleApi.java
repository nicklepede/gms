package com.google.android.gms.chimera.container;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import defpackage.asow;
import defpackage.pqw;
import defpackage.pvb;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class DynamiteWithNativeLibFallbackModuleApi extends DynamiteModuleApi {
    @Override // com.google.android.gms.chimera.container.DynamiteModuleApi, com.google.android.chimera.container.ModuleApi
    public void onBeforeApkLoad(Context context, pqw pqwVar) {
        ArrayList arrayList = new ArrayList();
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (asow.f(context)) {
            Iterator it = asow.c(context).iterator();
            while (it.hasNext()) {
                arrayList.add(((File) it.next()).getAbsolutePath());
            }
        } else {
            String str = applicationInfo.sourceDir;
            Iterator it2 = pvb.a().iterator();
            while (it2.hasNext()) {
                arrayList.add(str + "!/lib/" + ((String) it2.next()));
            }
        }
        String join = arrayList.isEmpty() ? null : TextUtils.join(File.pathSeparator, arrayList);
        if (join != null) {
            pqwVar.w(join);
        }
        super.onBeforeApkLoad(context, pqwVar);
    }
}
