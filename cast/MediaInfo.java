package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ambz;
import defpackage.amxr;
import defpackage.arxc;
import defpackage.aspq;
import defpackage.eite;
import defpackage.eitj;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class MediaInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public String b;
    public MediaMetadata c;
    public long d;
    public List e;
    public TextTrackStyle f;
    String g;
    public String h;
    public VastAdsRequest i;
    public long j;
    public String k;
    public String l;
    public String m;
    public String n;
    private String o;
    private List p;
    private List q;
    private JSONObject r;

    static {
        Pattern pattern = amxr.a;
        CREATOR = new ambz();
    }

    public MediaInfo(String str, int i, String str2, MediaMetadata mediaMetadata, long j, List list, TextTrackStyle textTrackStyle, String str3, List list2, List list3, String str4, VastAdsRequest vastAdsRequest, long j2, String str5, String str6, String str7, String str8) {
        this.o = str;
        this.a = i;
        this.b = str2;
        this.c = mediaMetadata;
        this.d = j;
        this.e = list;
        this.f = textTrackStyle;
        this.g = str3;
        if (str3 != null) {
            try {
                this.r = new JSONObject(this.g);
            } catch (JSONException unused) {
                this.r = null;
                this.g = null;
            }
        } else {
            this.r = null;
        }
        this.p = list2;
        this.q = list3;
        this.h = str4;
        this.i = vastAdsRequest;
        this.j = j2;
        this.k = str5;
        this.l = str6;
        this.m = str7;
        this.n = str8;
        if (this.o == null && str6 == null && str4 == null) {
            throw new IllegalArgumentException("Either contentID or contentUrl or entity should be set");
        }
    }

    public final JSONObject a() {
        long j;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("contentId", this.o);
            jSONObject.putOpt("contentUrl", this.l);
            int i = this.a;
            jSONObject.put("streamType", i != 1 ? i != 2 ? "NONE" : "LIVE" : "BUFFERED");
            Object obj = this.b;
            if (obj != null) {
                jSONObject.put("contentType", obj);
            }
            MediaMetadata mediaMetadata = this.c;
            if (mediaMetadata != null) {
                jSONObject.put("metadata", mediaMetadata.d());
            }
            long j2 = this.d;
            long j3 = -1;
            if (j2 <= -1) {
                jSONObject.put("duration", JSONObject.NULL);
            } else {
                jSONObject.put("duration", amxr.a(j2));
            }
            if (this.e != null) {
                JSONArray jSONArray = new JSONArray();
                for (MediaTrack mediaTrack : this.e) {
                    long j4 = j3;
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("trackId", mediaTrack.a);
                        int i2 = mediaTrack.b;
                        if (i2 == 1) {
                            jSONObject2.put("type", "TEXT");
                        } else if (i2 == 2) {
                            jSONObject2.put("type", "AUDIO");
                        } else if (i2 == 3) {
                            jSONObject2.put("type", "VIDEO");
                        }
                        String str = mediaTrack.c;
                        if (str != null) {
                            jSONObject2.put("trackContentId", str);
                        }
                        String str2 = mediaTrack.d;
                        if (str2 != null) {
                            jSONObject2.put("trackContentType", str2);
                        }
                        String str3 = mediaTrack.e;
                        if (str3 != null) {
                            jSONObject2.put("name", str3);
                        }
                        String str4 = mediaTrack.f;
                        if (!TextUtils.isEmpty(str4)) {
                            jSONObject2.put("language", str4);
                        }
                        int i3 = mediaTrack.g;
                        if (i3 == 1) {
                            jSONObject2.put("subtype", "SUBTITLES");
                        } else if (i3 == 2) {
                            jSONObject2.put("subtype", "CAPTIONS");
                        } else if (i3 == 3) {
                            jSONObject2.put("subtype", "DESCRIPTIONS");
                        } else if (i3 == 4) {
                            jSONObject2.put("subtype", "CHAPTERS");
                        } else if (i3 == 5) {
                            jSONObject2.put("subtype", "METADATA");
                        }
                        List list = mediaTrack.h;
                        if (list != null) {
                            jSONObject2.put("roles", new JSONArray((Collection) list));
                        }
                        JSONObject jSONObject3 = mediaTrack.j;
                        if (jSONObject3 != null) {
                            jSONObject2.put("customData", jSONObject3);
                        }
                    } catch (JSONException unused) {
                    }
                    jSONArray.put(jSONObject2);
                    j3 = j4;
                }
                j = j3;
                jSONObject.put("tracks", jSONArray);
            } else {
                j = -1;
            }
            TextTrackStyle textTrackStyle = this.f;
            if (textTrackStyle != null) {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("fontScale", textTrackStyle.a);
                    int i4 = textTrackStyle.b;
                    if (i4 != 0) {
                        jSONObject4.put("foregroundColor", TextTrackStyle.b(i4));
                    }
                    int i5 = textTrackStyle.c;
                    if (i5 != 0) {
                        jSONObject4.put("backgroundColor", TextTrackStyle.b(i5));
                    }
                    int i6 = textTrackStyle.d;
                    if (i6 == 0) {
                        jSONObject4.put("edgeType", "NONE");
                    } else if (i6 == 1) {
                        jSONObject4.put("edgeType", "OUTLINE");
                    } else if (i6 == 2) {
                        jSONObject4.put("edgeType", "DROP_SHADOW");
                    } else if (i6 == 3) {
                        jSONObject4.put("edgeType", "RAISED");
                    } else if (i6 == 4) {
                        jSONObject4.put("edgeType", "DEPRESSED");
                    }
                    int i7 = textTrackStyle.e;
                    if (i7 != 0) {
                        jSONObject4.put("edgeColor", TextTrackStyle.b(i7));
                    }
                    int i8 = textTrackStyle.f;
                    if (i8 == 0) {
                        jSONObject4.put("windowType", "NONE");
                    } else if (i8 == 1) {
                        jSONObject4.put("windowType", "NORMAL");
                    } else if (i8 == 2) {
                        jSONObject4.put("windowType", "ROUNDED_CORNERS");
                    }
                    int i9 = textTrackStyle.g;
                    if (i9 != 0) {
                        jSONObject4.put("windowColor", TextTrackStyle.b(i9));
                    }
                    if (textTrackStyle.f == 2) {
                        jSONObject4.put("windowRoundedCornerRadius", textTrackStyle.h);
                    }
                    String str5 = textTrackStyle.i;
                    if (str5 != null) {
                        jSONObject4.put("fontFamily", str5);
                    }
                    switch (textTrackStyle.j) {
                        case 0:
                            jSONObject4.put("fontGenericFamily", "SANS_SERIF");
                            break;
                        case 1:
                            jSONObject4.put("fontGenericFamily", "MONOSPACED_SANS_SERIF");
                            break;
                        case 2:
                            jSONObject4.put("fontGenericFamily", "SERIF");
                            break;
                        case 3:
                            jSONObject4.put("fontGenericFamily", "MONOSPACED_SERIF");
                            break;
                        case 4:
                            jSONObject4.put("fontGenericFamily", "CASUAL");
                            break;
                        case 5:
                            jSONObject4.put("fontGenericFamily", "CURSIVE");
                            break;
                        case 6:
                            jSONObject4.put("fontGenericFamily", "SMALL_CAPITALS");
                            break;
                    }
                    int i10 = textTrackStyle.k;
                    if (i10 == 0) {
                        jSONObject4.put("fontStyle", "NORMAL");
                    } else if (i10 == 1) {
                        jSONObject4.put("fontStyle", "BOLD");
                    } else if (i10 == 2) {
                        jSONObject4.put("fontStyle", "ITALIC");
                    } else if (i10 == 3) {
                        jSONObject4.put("fontStyle", "BOLD_ITALIC");
                    }
                    JSONObject jSONObject5 = textTrackStyle.m;
                    if (jSONObject5 != null) {
                        jSONObject4.put("customData", jSONObject5);
                    }
                } catch (JSONException unused2) {
                }
                jSONObject.put("textTrackStyle", jSONObject4);
            }
            Object obj2 = this.r;
            if (obj2 != null) {
                jSONObject.put("customData", obj2);
            }
            Object obj3 = this.h;
            if (obj3 != null) {
                jSONObject.put("entity", obj3);
            }
            if (this.p != null) {
                JSONArray jSONArray2 = new JSONArray();
                for (AdBreakInfo adBreakInfo : this.p) {
                    JSONObject jSONObject6 = new JSONObject();
                    try {
                        jSONObject6.put("id", adBreakInfo.b);
                        jSONObject6.put("position", amxr.a(adBreakInfo.a));
                        jSONObject6.put("isWatched", adBreakInfo.d);
                        jSONObject6.put("isEmbedded", adBreakInfo.f);
                        jSONObject6.put("duration", amxr.a(adBreakInfo.c));
                        jSONObject6.put("expanded", adBreakInfo.g);
                        String[] strArr = adBreakInfo.e;
                        if (strArr != null) {
                            JSONArray jSONArray3 = new JSONArray();
                            for (String str6 : strArr) {
                                jSONArray3.put(str6);
                            }
                            jSONObject6.put("breakClipIds", jSONArray3);
                        }
                    } catch (JSONException unused3) {
                    }
                    jSONArray2.put(jSONObject6);
                }
                jSONObject.put("breaks", jSONArray2);
            }
            if (this.q != null) {
                JSONArray jSONArray4 = new JSONArray();
                for (AdBreakClipInfo adBreakClipInfo : this.q) {
                    JSONObject jSONObject7 = new JSONObject();
                    try {
                        jSONObject7.put("id", adBreakClipInfo.a);
                        jSONObject7.put("duration", amxr.a(adBreakClipInfo.c));
                        long j5 = adBreakClipInfo.j;
                        if (j5 != j) {
                            jSONObject7.put("whenSkippable", amxr.a(j5));
                        }
                        String str7 = adBreakClipInfo.h;
                        if (str7 != null) {
                            jSONObject7.put("contentId", str7);
                        }
                        String str8 = adBreakClipInfo.e;
                        if (str8 != null) {
                            jSONObject7.put("contentType", str8);
                        }
                        String str9 = adBreakClipInfo.b;
                        if (str9 != null) {
                            jSONObject7.put("title", str9);
                        }
                        String str10 = adBreakClipInfo.d;
                        if (str10 != null) {
                            jSONObject7.put("contentUrl", str10);
                        }
                        String str11 = adBreakClipInfo.f;
                        if (str11 != null) {
                            jSONObject7.put("clickThroughUrl", str11);
                        }
                        JSONObject jSONObject8 = adBreakClipInfo.m;
                        if (jSONObject8 != null) {
                            jSONObject7.put("customData", jSONObject8);
                        }
                        String str12 = adBreakClipInfo.i;
                        if (str12 != null) {
                            jSONObject7.put("posterUrl", str12);
                        }
                        String str13 = adBreakClipInfo.k;
                        if (str13 != null) {
                            jSONObject7.put("hlsSegmentFormat", str13);
                        }
                        VastAdsRequest vastAdsRequest = adBreakClipInfo.l;
                        if (vastAdsRequest != null) {
                            jSONObject7.put("vastAdsRequest", vastAdsRequest.b());
                        }
                    } catch (JSONException unused4) {
                    }
                    jSONArray4.put(jSONObject7);
                }
                jSONObject.put("breakClips", jSONArray4);
            }
            VastAdsRequest vastAdsRequest2 = this.i;
            if (vastAdsRequest2 != null) {
                jSONObject.put("vmapAdsRequest", vastAdsRequest2.b());
            }
            long j6 = this.j;
            if (j6 != j) {
                jSONObject.put("startAbsoluteTime", amxr.a(j6));
            }
            jSONObject.putOpt("atvEntity", this.k);
            Object obj4 = this.m;
            if (obj4 != null) {
                jSONObject.put("hlsSegmentFormat", obj4);
            }
            Object obj5 = this.n;
            if (obj5 != null) {
                jSONObject.put("hlsVideoSegmentFormat", obj5);
            }
        } catch (JSONException unused5) {
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0093 A[LOOP:0: B:4:0x0021->B:10:0x0093, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x009a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015e A[LOOP:2: B:34:0x00ba->B:40:0x015e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0165 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void b(org.json.JSONObject r26) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaInfo.b(org.json.JSONObject):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaInfo)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) obj;
        JSONObject jSONObject = this.r;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = mediaInfo.r;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || aspq.b(jSONObject, jSONObject2)) && amxr.u(this.o, mediaInfo.o) && this.a == mediaInfo.a && amxr.u(this.b, mediaInfo.b) && amxr.u(this.c, mediaInfo.c) && this.d == mediaInfo.d && amxr.u(this.e, mediaInfo.e) && amxr.u(this.f, mediaInfo.f) && amxr.u(this.p, mediaInfo.p) && amxr.u(this.q, mediaInfo.q) && amxr.u(this.h, mediaInfo.h) && amxr.u(this.i, mediaInfo.i) && this.j == mediaInfo.j && amxr.u(this.k, mediaInfo.k) && amxr.u(this.l, mediaInfo.l) && amxr.u(this.m, mediaInfo.m) && amxr.u(this.n, mediaInfo.n);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.o, Integer.valueOf(this.a), this.b, this.c, Long.valueOf(this.d), String.valueOf(this.r), this.e, this.f, this.p, this.q, this.h, this.i, Long.valueOf(this.j), this.k, this.m, this.n});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.r;
        this.g = jSONObject == null ? null : jSONObject.toString();
        int a = arxc.a(parcel);
        String str = this.o;
        if (str == null) {
            str = "";
        }
        arxc.v(parcel, 2, str, false);
        arxc.o(parcel, 3, this.a);
        arxc.v(parcel, 4, this.b, false);
        arxc.t(parcel, 5, this.c, i, false);
        arxc.q(parcel, 6, this.d);
        arxc.y(parcel, 7, this.e, false);
        arxc.t(parcel, 8, this.f, i, false);
        arxc.v(parcel, 9, this.g, false);
        List list = this.p;
        arxc.y(parcel, 10, list == null ? null : DesugarCollections.unmodifiableList(list), false);
        List list2 = this.q;
        arxc.y(parcel, 11, list2 != null ? DesugarCollections.unmodifiableList(list2) : null, false);
        arxc.v(parcel, 12, this.h, false);
        arxc.t(parcel, 13, this.i, i, false);
        arxc.q(parcel, 14, this.j);
        arxc.v(parcel, 15, this.k, false);
        arxc.v(parcel, 16, this.l, false);
        arxc.v(parcel, 17, this.m, false);
        arxc.v(parcel, 18, this.n, false);
        arxc.c(parcel, a);
    }

    public MediaInfo(JSONObject jSONObject) {
        this(jSONObject.optString("contentId"), -1, null, null, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        double d;
        int i;
        int i2;
        eitj eitjVar;
        String optString = jSONObject.optString("streamType", "NONE");
        if ("NONE".equals(optString)) {
            this.a = 0;
        } else if ("BUFFERED".equals(optString)) {
            this.a = 1;
        } else if ("LIVE".equals(optString)) {
            this.a = 2;
        } else {
            this.a = -1;
        }
        this.b = amxr.j(jSONObject, "contentType");
        if (jSONObject.has("metadata")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
            MediaMetadata mediaMetadata = new MediaMetadata(jSONObject2.getInt("metadataType"));
            this.c = mediaMetadata;
            mediaMetadata.e(jSONObject2);
        }
        this.d = -1L;
        double d2 = 0.0d;
        if (this.a != 2 && jSONObject.has("duration") && !jSONObject.isNull("duration")) {
            double optDouble = jSONObject.optDouble("duration", 0.0d);
            if (!Double.isNaN(optDouble) && !Double.isInfinite(optDouble) && optDouble >= 0.0d) {
                this.d = amxr.c(optDouble);
            }
        }
        if (jSONObject.has("tracks")) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("tracks");
            int i3 = 0;
            while (i3 < jSONArray.length()) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i3);
                double d3 = d2;
                long j = jSONObject3.getLong("trackId");
                String optString2 = jSONObject3.optString("type");
                if ("TEXT".equals(optString2)) {
                    i = 1;
                } else if ("AUDIO".equals(optString2)) {
                    i = 2;
                } else {
                    i = "VIDEO".equals(optString2) ? 3 : 0;
                }
                String j2 = amxr.j(jSONObject3, "trackContentId");
                String j3 = amxr.j(jSONObject3, "trackContentType");
                String j4 = amxr.j(jSONObject3, "name");
                String j5 = amxr.j(jSONObject3, "language");
                if (jSONObject3.has("subtype")) {
                    String string = jSONObject3.getString("subtype");
                    if ("SUBTITLES".equals(string)) {
                        i2 = 1;
                    } else if ("CAPTIONS".equals(string)) {
                        i2 = 2;
                    } else if ("DESCRIPTIONS".equals(string)) {
                        i2 = 3;
                    } else if ("CHAPTERS".equals(string)) {
                        i2 = 4;
                    } else {
                        i2 = "METADATA".equals(string) ? 5 : -1;
                    }
                } else {
                    i2 = 0;
                }
                if (jSONObject3.has("roles")) {
                    int i4 = eitj.d;
                    eite eiteVar = new eite();
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("roles");
                    for (int i5 = 0; i5 < jSONArray2.length(); i5++) {
                        eiteVar.i(jSONArray2.optString(i5));
                    }
                    eitjVar = eiteVar.g();
                } else {
                    eitjVar = null;
                }
                arrayList.add(new MediaTrack(j, i, j2, j3, j4, j5, i2, eitjVar, jSONObject3.optJSONObject("customData")));
                i3++;
                d2 = d3;
            }
            d = d2;
            this.e = new ArrayList(arrayList);
        } else {
            d = 0.0d;
            this.e = null;
        }
        if (jSONObject.has("textTrackStyle")) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("textTrackStyle");
            TextTrackStyle textTrackStyle = new TextTrackStyle(1.0f, 0, 0, -1, 0, -1, 0, 0, null, -1, -1, null);
            textTrackStyle.a = (float) jSONObject4.optDouble("fontScale", 1.0d);
            textTrackStyle.b = TextTrackStyle.a(jSONObject4.optString("foregroundColor"));
            textTrackStyle.c = TextTrackStyle.a(jSONObject4.optString("backgroundColor"));
            if (jSONObject4.has("edgeType")) {
                String string2 = jSONObject4.getString("edgeType");
                if ("NONE".equals(string2)) {
                    textTrackStyle.d = 0;
                } else if ("OUTLINE".equals(string2)) {
                    textTrackStyle.d = 1;
                } else if ("DROP_SHADOW".equals(string2)) {
                    textTrackStyle.d = 2;
                } else if ("RAISED".equals(string2)) {
                    textTrackStyle.d = 3;
                } else if ("DEPRESSED".equals(string2)) {
                    textTrackStyle.d = 4;
                }
            }
            textTrackStyle.e = TextTrackStyle.a(jSONObject4.optString("edgeColor"));
            if (jSONObject4.has("windowType")) {
                String string3 = jSONObject4.getString("windowType");
                if ("NONE".equals(string3)) {
                    textTrackStyle.f = 0;
                } else if ("NORMAL".equals(string3)) {
                    textTrackStyle.f = 1;
                } else if ("ROUNDED_CORNERS".equals(string3)) {
                    textTrackStyle.f = 2;
                }
            }
            textTrackStyle.g = TextTrackStyle.a(jSONObject4.optString("windowColor"));
            if (textTrackStyle.f == 2) {
                textTrackStyle.h = jSONObject4.optInt("windowRoundedCornerRadius", 0);
            }
            textTrackStyle.i = amxr.j(jSONObject4, "fontFamily");
            if (jSONObject4.has("fontGenericFamily")) {
                String string4 = jSONObject4.getString("fontGenericFamily");
                if ("SANS_SERIF".equals(string4)) {
                    textTrackStyle.j = 0;
                } else if ("MONOSPACED_SANS_SERIF".equals(string4)) {
                    textTrackStyle.j = 1;
                } else if ("SERIF".equals(string4)) {
                    textTrackStyle.j = 2;
                } else if ("MONOSPACED_SERIF".equals(string4)) {
                    textTrackStyle.j = 3;
                } else if ("CASUAL".equals(string4)) {
                    textTrackStyle.j = 4;
                } else if ("CURSIVE".equals(string4)) {
                    textTrackStyle.j = 5;
                } else if ("SMALL_CAPITALS".equals(string4)) {
                    textTrackStyle.j = 6;
                }
            }
            if (jSONObject4.has("fontStyle")) {
                String string5 = jSONObject4.getString("fontStyle");
                if ("NORMAL".equals(string5)) {
                    textTrackStyle.k = 0;
                } else if ("BOLD".equals(string5)) {
                    textTrackStyle.k = 1;
                } else if ("ITALIC".equals(string5)) {
                    textTrackStyle.k = 2;
                } else if ("BOLD_ITALIC".equals(string5)) {
                    textTrackStyle.k = 3;
                }
            }
            textTrackStyle.m = jSONObject4.optJSONObject("customData");
            this.f = textTrackStyle;
        } else {
            this.f = null;
        }
        b(jSONObject);
        this.r = jSONObject.optJSONObject("customData");
        this.h = amxr.j(jSONObject, "entity");
        this.k = amxr.j(jSONObject, "atvEntity");
        this.i = VastAdsRequest.a(jSONObject.optJSONObject("vmapAdsRequest"));
        if (jSONObject.has("startAbsoluteTime") && !jSONObject.isNull("startAbsoluteTime")) {
            double optDouble2 = jSONObject.optDouble("startAbsoluteTime");
            if (!Double.isNaN(optDouble2) && !Double.isInfinite(optDouble2) && optDouble2 >= d) {
                this.j = amxr.c(optDouble2);
            }
        }
        if (jSONObject.has("contentUrl")) {
            this.l = jSONObject.optString("contentUrl");
        }
        this.m = amxr.j(jSONObject, "hlsSegmentFormat");
        this.n = amxr.j(jSONObject, "hlsVideoSegmentFormat");
    }
}
