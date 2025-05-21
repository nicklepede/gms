package com.google.android.gms.smartdevice.d2d.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.folsom.SharedKey;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.arxc;
import defpackage.arxd;
import defpackage.ddfy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class FolsomSecurityDomainAndKeys extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new ddfy();
    private static final HashMap d;
    final Set a;
    public String b;
    public ArrayList c;

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put("securityDomain", new FastJsonResponse$Field(7, false, 7, false, "securityDomain", 2, null));
        hashMap.put("sharedKeys", new FastJsonResponse$Field(7, true, 7, true, "sharedKeys", 3, null));
    }

    public FolsomSecurityDomainAndKeys(Set set, String str, ArrayList arrayList) {
        this.a = set;
        this.b = str;
        this.c = arrayList;
    }

    @Override // defpackage.ashs
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.b;
        }
        if (i == 3) {
            return this.c;
        }
        throw new IllegalStateException(a.j(i, "Unknown field ID: "));
    }

    @Override // defpackage.ashs
    public final Map b() {
        return d;
    }

    @Override // defpackage.ashs
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // defpackage.ashs
    protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            if (str2 != null) {
                this.b = str2;
                this.a.add(2);
                return;
            }
            i = 2;
        }
        throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a valid string."));
    }

    @Override // defpackage.ashs
    public final void gy(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i == 3) {
            if (arrayList != null) {
                this.c = arrayList;
                this.a.add(3);
                return;
            }
            i = 3;
        }
        throw new IllegalArgumentException(a.l(i, "Field with id=", " is not a known array of string."));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = arxc.a(parcel);
        if (set.contains(2)) {
            arxc.v(parcel, 2, this.b, true);
        }
        if (set.contains(3)) {
            arxc.x(parcel, 3, this.c, true);
        }
        arxc.c(parcel, a);
    }

    public FolsomSecurityDomainAndKeys() {
        this.a = new HashSet();
        this.b = "";
        this.c = new ArrayList(0);
    }

    public FolsomSecurityDomainAndKeys(String str, List list) {
        this.a = new HashSet();
        this.b = "";
        this.c = new ArrayList(0);
        this.b = str;
        this.c = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.c.add(arxd.d((SharedKey) it.next()));
        }
        this.a.add(2);
        this.a.add(3);
    }
}
