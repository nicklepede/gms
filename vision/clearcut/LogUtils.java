package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import com.google.mlkit.vision.common.aidls.ImageMetadataParcel;
import defpackage.assx;
import defpackage.dibc;
import defpackage.evaa;
import defpackage.evac;
import defpackage.evad;
import defpackage.evae;
import defpackage.evaf;
import defpackage.evah;
import defpackage.feab;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedh;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class LogUtils {
    private static List createEngineAnalysis(long j, int i, String str, String str2, List list) {
        fecj v = evac.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        evac evacVar = (evac) fecpVar;
        str2.getClass();
        evacVar.b |= 1;
        evacVar.c = str2;
        if (!fecpVar.L()) {
            v.U();
        }
        fecp fecpVar2 = v.b;
        evac evacVar2 = (evac) fecpVar2;
        evacVar2.b |= 16;
        evacVar2.e = j;
        long j2 = i;
        if (!fecpVar2.L()) {
            v.U();
        }
        fecp fecpVar3 = v.b;
        evac evacVar3 = (evac) fecpVar3;
        evacVar3.b |= 32;
        evacVar3.f = j2;
        if (list != null) {
            if (!fecpVar3.L()) {
                v.U();
            }
            evac evacVar4 = (evac) v.b;
            fedh fedhVar = evacVar4.g;
            if (!fedhVar.c()) {
                evacVar4.g = fecp.E(fedhVar);
            }
            feab.E(list, evacVar4.g);
        }
        if (str != null) {
            if (!v.b.L()) {
                v.U();
            }
            evac evacVar5 = (evac) v.b;
            evacVar5.b |= 8;
            evacVar5.d = str;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add((evac) v.Q());
        return arrayList;
    }

    private static evaf createImageData(FrameMetadataParcel frameMetadataParcel) {
        fecj v = evaf.a.v();
        long j = frameMetadataParcel.b;
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        evaf evafVar = (evaf) fecpVar;
        evafVar.b |= 4;
        evafVar.d = j;
        long j2 = frameMetadataParcel.a;
        if (!fecpVar.L()) {
            v.U();
        }
        fecp fecpVar2 = v.b;
        evaf evafVar2 = (evaf) fecpVar2;
        evafVar2.b |= 2;
        evafVar2.c = j2;
        long j3 = frameMetadataParcel.c;
        if (!fecpVar2.L()) {
            v.U();
        }
        fecp fecpVar3 = v.b;
        evaf evafVar3 = (evaf) fecpVar3;
        evafVar3.b |= 8;
        evafVar3.e = j3;
        long j4 = frameMetadataParcel.d;
        if (!fecpVar3.L()) {
            v.U();
        }
        evaf evafVar4 = (evaf) v.b;
        evafVar4.b |= 16;
        evafVar4.f = j4;
        return (evaf) v.Q();
    }

    public static evah createVisionExtension(long j, int i, String str, String str2, List list, FrameMetadataParcel frameMetadataParcel) {
        evad evadVar = (evad) evae.a.v();
        evadVar.a(createEngineAnalysis(j, i, str, str2, list));
        evaf createImageData = createImageData(frameMetadataParcel);
        if (!evadVar.b.L()) {
            evadVar.U();
        }
        evae evaeVar = (evae) evadVar.b;
        createImageData.getClass();
        evaeVar.c = createImageData;
        evaeVar.b |= 1;
        evae evaeVar2 = (evae) evadVar.Q();
        fecj v = evah.a.v();
        if (!v.b.L()) {
            v.U();
        }
        evah evahVar = (evah) v.b;
        evaeVar2.getClass();
        evahVar.d = evaeVar2;
        evahVar.b |= 4;
        return (evah) v.Q();
    }

    private static String getApplicationId(Context context) {
        return context.getPackageName();
    }

    public static evaa getApplicationInfo(Context context) {
        fecj v = evaa.a.v();
        String applicationId = getApplicationId(context);
        if (!v.b.L()) {
            v.U();
        }
        evaa evaaVar = (evaa) v.b;
        applicationId.getClass();
        evaaVar.b |= 1;
        evaaVar.c = applicationId;
        String applicationVersion = getApplicationVersion(context);
        if (applicationVersion != null) {
            if (!v.b.L()) {
                v.U();
            }
            evaa evaaVar2 = (evaa) v.b;
            evaaVar2.b |= 2;
            evaaVar2.d = applicationVersion;
        }
        return (evaa) v.Q();
    }

    private static String getApplicationVersion(Context context) {
        try {
            return assx.b(context).f(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            dibc.b(e, "Unable to find calling package info for %s", context.getPackageName());
            return null;
        }
    }

    public static evah createVisionExtension(long j, int i, String str, String str2, List list, ImageMetadataParcel imageMetadataParcel) {
        fecj v = evaf.a.v();
        long j2 = imageMetadataParcel.c;
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        evaf evafVar = (evaf) fecpVar;
        evafVar.b |= 4;
        evafVar.d = j2;
        long j3 = imageMetadataParcel.b;
        if (!fecpVar.L()) {
            v.U();
        }
        fecp fecpVar2 = v.b;
        evaf evafVar2 = (evaf) fecpVar2;
        evafVar2.b |= 2;
        evafVar2.c = j3;
        long j4 = imageMetadataParcel.e;
        if (!fecpVar2.L()) {
            v.U();
        }
        evaf evafVar3 = (evaf) v.b;
        evafVar3.b |= 16;
        evafVar3.f = j4;
        evaf evafVar4 = (evaf) v.Q();
        evad evadVar = (evad) evae.a.v();
        evadVar.a(createEngineAnalysis(j, i, str, str2, list));
        if (!evadVar.b.L()) {
            evadVar.U();
        }
        evae evaeVar = (evae) evadVar.b;
        evafVar4.getClass();
        evaeVar.c = evafVar4;
        evaeVar.b |= 1;
        evae evaeVar2 = (evae) evadVar.Q();
        fecj v2 = evah.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        evah evahVar = (evah) v2.b;
        evaeVar2.getClass();
        evahVar.d = evaeVar2;
        evahVar.b |= 4;
        return (evah) v2.Q();
    }
}
