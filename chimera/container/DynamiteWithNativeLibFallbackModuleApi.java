package com.google.android.gms.chimera.container;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import defpackage.ausq;
import defpackage.rka;
import defpackage.rof;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class DynamiteWithNativeLibFallbackModuleApi extends DynamiteModuleApi {
    @Override // com.google.android.gms.chimera.container.DynamiteModuleApi, com.google.android.chimera.container.ModuleApi
    public void onBeforeApkLoad(Context context, rka rkaVar) {
        ArrayList arrayList = new ArrayList();
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (ausq.f(context)) {
            Iterator it = ausq.c(context).iterator();
            while (it.hasNext()) {
                arrayList.add(((File) it.next()).getAbsolutePath());
            }
        } else {
            String str = applicationInfo.sourceDir;
            Iterator it2 = rof.a().iterator();
            while (it2.hasNext()) {
                arrayList.add(str + "!/lib/" + ((String) it2.next()));
            }
        }
        String join = arrayList.isEmpty() ? null : TextUtils.join(File.pathSeparator, arrayList);
        if (join != null) {
            rkaVar.w(join);
        }
        super.onBeforeApkLoad(context, rkaVar);
    }
}
