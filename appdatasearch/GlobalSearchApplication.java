package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.trj;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class GlobalSearchApplication extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new trj();
    public final GlobalSearchApplicationInfo a;
    public final GlobalSearchAppCorpusFeatures[] b;
    public final boolean c;

    public GlobalSearchApplication(GlobalSearchApplicationInfo globalSearchApplicationInfo, GlobalSearchAppCorpusFeatures[] globalSearchAppCorpusFeaturesArr, boolean z) {
        this.a = globalSearchApplicationInfo;
        this.b = globalSearchAppCorpusFeaturesArr;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GlobalSearchApplication) {
            GlobalSearchApplication globalSearchApplication = (GlobalSearchApplication) obj;
            if (arwb.b(this.a, globalSearchApplication.a) && arwb.b(Boolean.valueOf(this.c), Boolean.valueOf(globalSearchApplication.c)) && Arrays.equals(this.b, globalSearchApplication.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.c), Integer.valueOf(Arrays.hashCode(this.b))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        trj.a(this, parcel, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public GlobalSearchApplication(com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo r6, boolean r7, java.util.Map r8) {
        /*
            r5 = this;
            if (r8 != 0) goto L4
            r8 = 0
            goto L3c
        L4:
            int r0 = r8.size()
            com.google.android.gms.appdatasearch.GlobalSearchAppCorpusFeatures[] r0 = new com.google.android.gms.appdatasearch.GlobalSearchAppCorpusFeatures[r0]
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
            r1 = 0
        L13:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r8.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            com.google.android.gms.appdatasearch.GlobalSearchAppCorpusFeatures r3 = new com.google.android.gms.appdatasearch.GlobalSearchAppCorpusFeatures
            java.lang.Object r4 = r2.getKey()
            java.lang.String r4 = (java.lang.String) r4
            defpackage.arwm.s(r4)
            java.lang.Object r2 = r2.getValue()
            com.google.android.gms.appdatasearch.Feature[] r2 = (com.google.android.gms.appdatasearch.Feature[]) r2
            defpackage.arwm.s(r2)
            r3.<init>(r4, r2)
            r0[r1] = r3
            int r1 = r1 + 1
            goto L13
        L3b:
            r8 = r0
        L3c:
            r5.<init>(r6, r8, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.appdatasearch.GlobalSearchApplication.<init>(com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo, boolean, java.util.Map):void");
    }
}
