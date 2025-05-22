package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aodn;
import defpackage.aodo;
import defpackage.aozc;
import defpackage.apac;
import defpackage.atzr;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class MediaMetadata extends AbstractSafeParcelable {
    private static final aodn e;
    public final List a;
    public final Bundle b;
    public int c;
    private static final String[] d = {"none", "String", "int", "double", "ISO-8601 date String", "Time in milliseconds as long"};
    public static final Parcelable.Creator CREATOR = new aodo();

    static {
        aodn aodnVar = new aodn();
        aodnVar.b("com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime", 4);
        aodnVar.b("com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate", 4);
        aodnVar.b("com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate", 4);
        aodnVar.b("com.google.android.gms.cast.metadata.TITLE", "title", 1);
        aodnVar.b("com.google.android.gms.cast.metadata.SUBTITLE", "subtitle", 1);
        aodnVar.b("com.google.android.gms.cast.metadata.ARTIST", "artist", 1);
        aodnVar.b("com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist", 1);
        aodnVar.b("com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName", 1);
        aodnVar.b("com.google.android.gms.cast.metadata.COMPOSER", "composer", 1);
        aodnVar.b("com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber", 2);
        aodnVar.b("com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber", 2);
        aodnVar.b("com.google.android.gms.cast.metadata.SEASON_NUMBER", "season", 2);
        aodnVar.b("com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode", 2);
        aodnVar.b("com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle", 1);
        aodnVar.b("com.google.android.gms.cast.metadata.STUDIO", "studio", 1);
        aodnVar.b("com.google.android.gms.cast.metadata.WIDTH", "width", 2);
        aodnVar.b("com.google.android.gms.cast.metadata.HEIGHT", "height", 2);
        aodnVar.b("com.google.android.gms.cast.metadata.LOCATION_NAME", "location", 1);
        aodnVar.b("com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude", 3);
        aodnVar.b("com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude", 3);
        aodnVar.b("com.google.android.gms.cast.metadata.SECTION_DURATION", "sectionDuration", 5);
        aodnVar.b("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "sectionStartTimeInMedia", 5);
        aodnVar.b("com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "sectionStartAbsoluteTime", 5);
        aodnVar.b("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "sectionStartTimeInContainer", 5);
        aodnVar.b("com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", "queueItemId", 2);
        aodnVar.b("com.google.android.gms.cast.metadata.BOOK_TITLE", "bookTitle", 1);
        aodnVar.b("com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "chapterNumber", 2);
        aodnVar.b("com.google.android.gms.cast.metadata.CHAPTER_TITLE", "chapterTitle", 1);
        e = aodnVar;
    }

    public MediaMetadata(List list, Bundle bundle, int i) {
        this.a = list;
        this.b = bundle;
        this.c = i;
    }

    public static void h(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("null and empty keys are not allowed");
        }
        int a = e.a(str);
        if (a == i || a == 0) {
            return;
        }
        throw new IllegalArgumentException("Value for " + str + " must be a " + d[i]);
    }

    private final boolean j(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !j((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    public final int a(String str) {
        h(str, 2);
        return this.b.getInt(str);
    }

    public final String b(String str) {
        h(str, 1);
        return this.b.getString(str);
    }

    public final Calendar c(String str) {
        h(str, 4);
        String string = this.b.getString(str);
        if (string != null) {
            return apac.a(string);
        }
        return null;
    }

    public final JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("metadataType", this.c);
        } catch (JSONException unused) {
        }
        JSONArray b = apac.b(this.a);
        if (b.length() != 0) {
            try {
                jSONObject.put("images", b);
            } catch (JSONException unused2) {
            }
        }
        ArrayList<String> arrayList = new ArrayList();
        int i = this.c;
        if (i == 0) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 1) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 2) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
        } else if (i == 3) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 4) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
        } else if (i == 5) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        try {
            for (String str : arrayList) {
                if (str != null) {
                    Bundle bundle = this.b;
                    if (bundle.containsKey(str)) {
                        aodn aodnVar = e;
                        String str2 = (String) aodnVar.a.get(str);
                        if (str2 != null) {
                            int a = aodnVar.a(str);
                            if (a != 1) {
                                if (a == 2) {
                                    jSONObject.put(str2, bundle.getInt(str));
                                } else if (a == 3) {
                                    jSONObject.put(str2, bundle.getDouble(str));
                                } else if (a != 4) {
                                    if (a == 5) {
                                        jSONObject.put(str2, aozc.a(bundle.getLong(str)));
                                    }
                                }
                            }
                            jSONObject.put(str2, bundle.getString(str));
                        }
                    }
                }
            }
            Bundle bundle2 = this.b;
            for (String str3 : bundle2.keySet()) {
                if (!str3.startsWith("com.google.")) {
                    Object obj = bundle2.get(str3);
                    if (obj instanceof String) {
                        jSONObject.put(str3, obj);
                    } else if (obj instanceof Integer) {
                        jSONObject.put(str3, obj);
                    } else if (obj instanceof Double) {
                        jSONObject.put(str3, obj);
                    }
                }
            }
        } catch (JSONException unused3) {
        }
        return jSONObject;
    }

    public final void e(JSONObject jSONObject) {
        this.b.clear();
        this.a.clear();
        this.c = 0;
        try {
            this.c = jSONObject.getInt("metadataType");
        } catch (JSONException unused) {
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null) {
            apac.c(this.a, optJSONArray);
        }
        ArrayList arrayList = new ArrayList();
        int i = this.c;
        if (i == 0) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 1) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 2) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
        } else if (i == 3) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 4) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
        } else if (i == 5) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        HashSet hashSet = new HashSet(arrayList);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && !"metadataType".equals(next)) {
                    aodn aodnVar = e;
                    String str = (String) aodnVar.b.get(next);
                    if (str == null) {
                        Object obj = jSONObject.get(next);
                        if (obj instanceof String) {
                            this.b.putString(next, (String) obj);
                        } else if (obj instanceof Integer) {
                            this.b.putInt(next, ((Integer) obj).intValue());
                        } else if (obj instanceof Double) {
                            this.b.putDouble(next, ((Double) obj).doubleValue());
                        }
                    } else if (hashSet.contains(str)) {
                        try {
                            Object obj2 = jSONObject.get(next);
                            if (obj2 != null) {
                                int a = aodnVar.a(str);
                                if (a != 1) {
                                    if (a != 2) {
                                        if (a == 3) {
                                            double optDouble = jSONObject.optDouble(next);
                                            if (!Double.isNaN(optDouble)) {
                                                this.b.putDouble(str, optDouble);
                                            }
                                        } else if (a != 4) {
                                            if (a == 5) {
                                                this.b.putLong(str, aozc.d(jSONObject.optLong(next)));
                                            }
                                        } else if (obj2 instanceof String) {
                                            String str2 = (String) obj2;
                                            if (apac.a(str2) != null) {
                                                this.b.putString(str, str2);
                                            }
                                        }
                                    } else if (obj2 instanceof Integer) {
                                        this.b.putInt(str, ((Integer) obj2).intValue());
                                    }
                                } else if (obj2 instanceof String) {
                                    this.b.putString(str, (String) obj2);
                                }
                            }
                        } catch (JSONException unused2) {
                        }
                    }
                }
            }
        } catch (JSONException unused3) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaMetadata)) {
            return false;
        }
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        return j(this.b, mediaMetadata.b) && this.a.equals(mediaMetadata.a);
    }

    public final void f(String str, int i) {
        h(str, 2);
        this.b.putInt(str, i);
    }

    public final void g(String str, String str2) {
        h(str, 1);
        this.b.putString(str, str2);
    }

    public final int hashCode() {
        Bundle bundle = this.b;
        int i = 17;
        if (bundle != null) {
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                Object obj = bundle.get(it.next());
                i = (i * 31) + (obj != null ? obj.hashCode() : 0);
            }
        }
        return (i * 31) + this.a.hashCode();
    }

    public final boolean i(String str) {
        return this.b.containsKey(str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = atzr.a(parcel);
        atzr.y(parcel, 2, list, false);
        atzr.g(parcel, 3, this.b, false);
        atzr.o(parcel, 4, this.c);
        atzr.c(parcel, a);
    }

    public MediaMetadata() {
        this(0);
    }

    public MediaMetadata(int i) {
        this(new ArrayList(), new Bundle(), i);
    }
}
