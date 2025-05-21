package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amcj;
import defpackage.amxr;
import defpackage.amye;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.aspq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class MediaStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public MediaInfo a;
    public long b;
    public int c;
    public double d;
    public int e;
    public int f;
    public long g;
    long h;
    double i;
    boolean j;
    long[] k;
    public int l;
    int m;
    String n;
    public JSONObject o;
    public int p;
    public final List q;
    public boolean r;
    AdBreakStatus s;
    VideoInfo t;
    public MediaLiveSeekableRange u;
    MediaQueueData v;
    boolean w;
    private final SparseArray x;

    static {
        new amye("MediaStatus");
        CREATOR = new amcj();
    }

    public MediaStatus(MediaInfo mediaInfo, long j, int i, double d, int i2, int i3, long j2, long j3, double d2, boolean z, long[] jArr, int i4, int i5, String str, int i6, List list, boolean z2, AdBreakStatus adBreakStatus, VideoInfo videoInfo, MediaLiveSeekableRange mediaLiveSeekableRange, MediaQueueData mediaQueueData) {
        this.q = new ArrayList();
        this.x = new SparseArray();
        this.a = mediaInfo;
        this.b = j;
        this.c = i;
        this.d = d;
        this.e = i2;
        this.f = i3;
        this.g = j2;
        this.h = j3;
        this.i = d2;
        this.j = z;
        this.k = jArr;
        this.l = i4;
        this.m = i5;
        this.n = str;
        if (str != null) {
            try {
                this.o = new JSONObject(this.n);
            } catch (JSONException unused) {
                this.o = null;
                this.n = null;
            }
        } else {
            this.o = null;
        }
        this.p = i6;
        if (list != null && !list.isEmpty()) {
            f(list);
        }
        this.r = z2;
        this.s = adBreakStatus;
        this.t = videoInfo;
        this.u = mediaLiveSeekableRange;
        this.v = mediaQueueData;
        boolean z3 = false;
        if (mediaQueueData != null && mediaQueueData.j) {
            z3 = true;
        }
        this.w = z3;
    }

    public static final boolean e(int i, int i2, int i3, int i4) {
        if (i != 1) {
            return false;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                return i4 != 2;
            }
            if (i2 != 3) {
                return true;
            }
        }
        return i3 == 0;
    }

    private final void f(List list) {
        List list2 = this.q;
        list2.clear();
        SparseArray sparseArray = this.x;
        sparseArray.clear();
        for (int i = 0; i < list.size(); i++) {
            MediaQueueItem mediaQueueItem = (MediaQueueItem) list.get(i);
            list2.add(mediaQueueItem);
            sparseArray.put(mediaQueueItem.b, Integer.valueOf(i));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x01a5, code lost:
    
        if (r30.k != null) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0386 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0436 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x03b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0369 A[Catch: JSONException -> 0x0377, TryCatch #1 {JSONException -> 0x0377, blocks: (B:361:0x033b, B:363:0x0369, B:364:0x036d), top: B:360:0x033b }] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(org.json.JSONObject r31, int r32) {
        /*
            Method dump skipped, instructions count: 1754
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaStatus.a(org.json.JSONObject, int):int");
    }

    public final MediaQueueItem b(int i) {
        Integer num = (Integer) this.x.get(i);
        if (num == null) {
            return null;
        }
        return (MediaQueueItem) this.q.get(num.intValue());
    }

    public final Integer c(int i) {
        return (Integer) this.x.get(i);
    }

    public final boolean d(long j) {
        return (j & this.h) != 0;
    }

    public final boolean equals(Object obj) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaStatus)) {
            return false;
        }
        MediaStatus mediaStatus = (MediaStatus) obj;
        return (this.o == null) == (mediaStatus.o == null) && this.b == mediaStatus.b && this.c == mediaStatus.c && this.d == mediaStatus.d && this.e == mediaStatus.e && this.f == mediaStatus.f && this.g == mediaStatus.g && this.i == mediaStatus.i && this.j == mediaStatus.j && this.l == mediaStatus.l && this.m == mediaStatus.m && this.p == mediaStatus.p && Arrays.equals(this.k, mediaStatus.k) && amxr.u(Long.valueOf(this.h), Long.valueOf(mediaStatus.h)) && amxr.u(this.q, mediaStatus.q) && amxr.u(this.a, mediaStatus.a) && ((jSONObject = this.o) == null || (jSONObject2 = mediaStatus.o) == null || aspq.b(jSONObject, jSONObject2)) && this.r == mediaStatus.r && amxr.u(this.s, mediaStatus.s) && amxr.u(this.t, mediaStatus.t) && amxr.u(this.u, mediaStatus.u) && arwb.b(this.v, mediaStatus.v) && this.w == mediaStatus.w;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Integer.valueOf(this.c), Double.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Long.valueOf(this.g), Long.valueOf(this.h), Double.valueOf(this.i), Boolean.valueOf(this.j), Integer.valueOf(Arrays.hashCode(this.k)), Integer.valueOf(this.l), Integer.valueOf(this.m), String.valueOf(this.o), Integer.valueOf(this.p), this.q, Boolean.valueOf(this.r), this.s, this.t, this.u, this.v});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.o;
        this.n = jSONObject == null ? null : jSONObject.toString();
        int a = arxc.a(parcel);
        arxc.t(parcel, 2, this.a, i, false);
        arxc.q(parcel, 3, this.b);
        arxc.o(parcel, 4, this.c);
        arxc.j(parcel, 5, this.d);
        arxc.o(parcel, 6, this.e);
        arxc.o(parcel, 7, this.f);
        arxc.q(parcel, 8, this.g);
        arxc.q(parcel, 9, this.h);
        arxc.j(parcel, 10, this.i);
        arxc.e(parcel, 11, this.j);
        arxc.r(parcel, 12, this.k, false);
        arxc.o(parcel, 13, this.l);
        arxc.o(parcel, 14, this.m);
        arxc.v(parcel, 15, this.n, false);
        arxc.o(parcel, 16, this.p);
        arxc.y(parcel, 17, this.q, false);
        arxc.e(parcel, 18, this.r);
        arxc.t(parcel, 19, this.s, i, false);
        arxc.t(parcel, 20, this.t, i, false);
        arxc.t(parcel, 21, this.u, i, false);
        arxc.t(parcel, 22, this.v, i, false);
        arxc.c(parcel, a);
    }

    public MediaStatus(JSONObject jSONObject) {
        this(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
        a(jSONObject, 0);
    }
}
