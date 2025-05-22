package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import com.google.mlkit.vision.common.aidls.ImageMetadataParcel;
import defpackage.auwr;
import defpackage.dkmn;
import defpackage.expt;
import defpackage.expv;
import defpackage.expw;
import defpackage.expx;
import defpackage.expy;
import defpackage.exqa;
import defpackage.fgou;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsa;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class LogUtils {
    private static List createEngineAnalysis(long j, int i, String str, String str2, List list) {
        fgrc v = expv.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        expv expvVar = (expv) fgriVar;
        str2.getClass();
        expvVar.b |= 1;
        expvVar.c = str2;
        if (!fgriVar.L()) {
            v.U();
        }
        fgri fgriVar2 = v.b;
        expv expvVar2 = (expv) fgriVar2;
        expvVar2.b |= 16;
        expvVar2.e = j;
        long j2 = i;
        if (!fgriVar2.L()) {
            v.U();
        }
        fgri fgriVar3 = v.b;
        expv expvVar3 = (expv) fgriVar3;
        expvVar3.b |= 32;
        expvVar3.f = j2;
        if (list != null) {
            if (!fgriVar3.L()) {
                v.U();
            }
            expv expvVar4 = (expv) v.b;
            fgsa fgsaVar = expvVar4.g;
            if (!fgsaVar.c()) {
                expvVar4.g = fgri.E(fgsaVar);
            }
            fgou.E(list, expvVar4.g);
        }
        if (str != null) {
            if (!v.b.L()) {
                v.U();
            }
            expv expvVar5 = (expv) v.b;
            expvVar5.b |= 8;
            expvVar5.d = str;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add((expv) v.Q());
        return arrayList;
    }

    private static expy createImageData(FrameMetadataParcel frameMetadataParcel) {
        fgrc v = expy.a.v();
        long j = frameMetadataParcel.b;
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        expy expyVar = (expy) fgriVar;
        expyVar.b |= 4;
        expyVar.d = j;
        long j2 = frameMetadataParcel.a;
        if (!fgriVar.L()) {
            v.U();
        }
        fgri fgriVar2 = v.b;
        expy expyVar2 = (expy) fgriVar2;
        expyVar2.b |= 2;
        expyVar2.c = j2;
        long j3 = frameMetadataParcel.c;
        if (!fgriVar2.L()) {
            v.U();
        }
        fgri fgriVar3 = v.b;
        expy expyVar3 = (expy) fgriVar3;
        expyVar3.b |= 8;
        expyVar3.e = j3;
        long j4 = frameMetadataParcel.d;
        if (!fgriVar3.L()) {
            v.U();
        }
        expy expyVar4 = (expy) v.b;
        expyVar4.b |= 16;
        expyVar4.f = j4;
        return (expy) v.Q();
    }

    public static exqa createVisionExtension(long j, int i, String str, String str2, List list, FrameMetadataParcel frameMetadataParcel) {
        expw expwVar = (expw) expx.a.v();
        expwVar.a(createEngineAnalysis(j, i, str, str2, list));
        expy createImageData = createImageData(frameMetadataParcel);
        if (!expwVar.b.L()) {
            expwVar.U();
        }
        expx expxVar = (expx) expwVar.b;
        createImageData.getClass();
        expxVar.c = createImageData;
        expxVar.b |= 1;
        expx expxVar2 = (expx) expwVar.Q();
        fgrc v = exqa.a.v();
        if (!v.b.L()) {
            v.U();
        }
        exqa exqaVar = (exqa) v.b;
        expxVar2.getClass();
        exqaVar.d = expxVar2;
        exqaVar.b |= 4;
        return (exqa) v.Q();
    }

    private static String getApplicationId(Context context) {
        return context.getPackageName();
    }

    public static expt getApplicationInfo(Context context) {
        fgrc v = expt.a.v();
        String applicationId = getApplicationId(context);
        if (!v.b.L()) {
            v.U();
        }
        expt exptVar = (expt) v.b;
        applicationId.getClass();
        exptVar.b |= 1;
        exptVar.c = applicationId;
        String applicationVersion = getApplicationVersion(context);
        if (applicationVersion != null) {
            if (!v.b.L()) {
                v.U();
            }
            expt exptVar2 = (expt) v.b;
            exptVar2.b |= 2;
            exptVar2.d = applicationVersion;
        }
        return (expt) v.Q();
    }

    private static String getApplicationVersion(Context context) {
        try {
            return auwr.b(context).f(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            dkmn.b(e, "Unable to find calling package info for %s", context.getPackageName());
            return null;
        }
    }

    public static exqa createVisionExtension(long j, int i, String str, String str2, List list, ImageMetadataParcel imageMetadataParcel) {
        fgrc v = expy.a.v();
        long j2 = imageMetadataParcel.c;
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        expy expyVar = (expy) fgriVar;
        expyVar.b |= 4;
        expyVar.d = j2;
        long j3 = imageMetadataParcel.b;
        if (!fgriVar.L()) {
            v.U();
        }
        fgri fgriVar2 = v.b;
        expy expyVar2 = (expy) fgriVar2;
        expyVar2.b |= 2;
        expyVar2.c = j3;
        long j4 = imageMetadataParcel.e;
        if (!fgriVar2.L()) {
            v.U();
        }
        expy expyVar3 = (expy) v.b;
        expyVar3.b |= 16;
        expyVar3.f = j4;
        expy expyVar4 = (expy) v.Q();
        expw expwVar = (expw) expx.a.v();
        expwVar.a(createEngineAnalysis(j, i, str, str2, list));
        if (!expwVar.b.L()) {
            expwVar.U();
        }
        expx expxVar = (expx) expwVar.b;
        expyVar4.getClass();
        expxVar.c = expyVar4;
        expxVar.b |= 1;
        expx expxVar2 = (expx) expwVar.Q();
        fgrc v2 = exqa.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        exqa exqaVar = (exqa) v2.b;
        expxVar2.getClass();
        exqaVar.d = expxVar2;
        exqaVar.b |= 4;
        return (exqa) v2.Q();
    }
}
