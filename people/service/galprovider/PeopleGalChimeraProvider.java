package com.google.android.gms.people.service.galprovider;

import android.accounts.Account;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.google.android.chimera.ContentProvider;
import com.google.android.chimera.ModuleContext;
import com.google.android.gms.R;
import defpackage.a;
import defpackage.apzg;
import defpackage.atwh;
import defpackage.bsup;
import defpackage.cvto;
import defpackage.cvts;
import defpackage.cvyk;
import defpackage.cwof;
import defpackage.cwpw;
import defpackage.cwqd;
import defpackage.cwqp;
import defpackage.cwqq;
import defpackage.cwqr;
import defpackage.cwqx;
import defpackage.cxdf;
import defpackage.cxhm;
import defpackage.eist;
import defpackage.eiuc;
import defpackage.eiul;
import defpackage.enkp;
import defpackage.enzm;
import defpackage.ewof;
import defpackage.ewpd;
import defpackage.ewpe;
import defpackage.ewpi;
import defpackage.ewqh;
import defpackage.ewql;
import defpackage.ewqp;
import defpackage.ewqr;
import defpackage.ewqs;
import defpackage.fgqs;
import defpackage.fgqt;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.ftzi;
import defpackage.fwuc;
import defpackage.wjw;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PeopleGalChimeraProvider extends ContentProvider {
    private static final UriMatcher b;
    public cwqd a;
    private final ArrayDeque c = new ArrayDeque();
    private bsup d;
    private Context e;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI("com.google.android.gms.people.gal.provider", "directories", 0);
        uriMatcher.addURI("com.google.android.gms.people.gal.provider", "contacts/filter/*", 1);
        uriMatcher.addURI("com.google.android.gms.people.gal.provider", "contacts/lookup/*/entities", 2);
        uriMatcher.addURI("com.google.android.gms.people.gal.provider", "contacts/lookup/*/#/entities", 3);
        uriMatcher.addURI("com.google.android.gms.people.gal.provider", "data/emails/filter/*", 4);
        uriMatcher.addURI("com.google.android.gms.people.gal.provider", "data/phones/filter/*", 5);
        uriMatcher.addURI("com.google.android.gms.people.gal.provider", "phone_lookup/*", 6);
        b = uriMatcher;
    }

    public PeopleGalChimeraProvider() {
    }

    public static Uri a(String str, boolean z, String str2, boolean z2) {
        Uri build = new Uri.Builder().scheme("content").authority(true != z2 ? "com.google.contacts.gal.provider" : "com.google.android.gms.people.gal.provider").appendEncodedPath("people_photo/").appendQueryParameter("account_name", str).appendQueryParameter("lookup", str2).build();
        return z ? build.buildUpon().appendQueryParameter("sz", Long.toString(ftzi.d())).build() : build;
    }

    public static boolean c(eiuc eiucVar) {
        return eiucVar.g.size() > 0 && !((eiul) eiucVar.g.get(0)).e;
    }

    public static void f(fgrc fgrcVar, Throwable th) {
        String a = cvto.a(th);
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        enkp enkpVar = (enkp) fgrcVar.b;
        enkp enkpVar2 = enkp.a;
        a.getClass();
        enkpVar.b |= 128;
        enkpVar.h = a;
    }

    public static final String g(Uri uri) {
        return Build.VERSION.SDK_INT < 26 ? "" : uri.getQueryParameter("callerPackage");
    }

    private static boolean h(Context context) {
        return ftzi.a.lK().u() ? cxdf.a(context).b() : cxdf.a(context).c();
    }

    private final Cursor i(String[] strArr, boolean z, fgrc fgrcVar) {
        int i;
        int i2;
        if (!z) {
            if (ftzi.j()) {
                if (!fgrcVar.b.L()) {
                    fgrcVar.U();
                }
                enkp enkpVar = (enkp) fgrcVar.b;
                enkp enkpVar2 = enkp.a;
                enkpVar.d = 17;
                enkpVar.b |= 2;
            }
            throw new UnsupportedOperationException();
        }
        MatrixCursor matrixCursor = new MatrixCursor(strArr);
        for (Account account : this.d.p("com.google")) {
            String.valueOf(account);
            String str = account.name;
            if (!str.endsWith("@gmail.com") && !str.endsWith("@googlemail.com")) {
                Object[] objArr = new Object[strArr.length];
                for (int i3 = 0; i3 < strArr.length; i3++) {
                    String str2 = strArr[i3];
                    if ("accountName".equals(str2)) {
                        objArr[i3] = str;
                    } else if ("accountType".equals(str2)) {
                        objArr[i3] = account.type;
                    } else {
                        if ("typeResourceId".equals(str2)) {
                            if (ftzi.h()) {
                                if (!fgrcVar.b.L()) {
                                    fgrcVar.U();
                                }
                                enkp enkpVar3 = (enkp) fgrcVar.b;
                                enkp enkpVar4 = enkp.a;
                                i = 0;
                                enkpVar3.b |= 256;
                                enkpVar3.i = R.string.directory_name;
                            } else {
                                i = 0;
                            }
                            try {
                                if (ftzi.k()) {
                                    i2 = apzg.a(this.e, R.string.directory_name);
                                    objArr[i3] = Integer.valueOf(i2);
                                } else {
                                    objArr[i3] = Integer.valueOf(R.string.directory_name);
                                    if (ftzi.i()) {
                                        Context context = this.e;
                                        ModuleContext moduleContext = ModuleContext.getModuleContext(context);
                                        if ((moduleContext == null ? context.getResources().getResourceName(R.string.directory_name) : moduleContext.getContainerResources().getResourceName(apzg.a(moduleContext, R.string.directory_name))) == null) {
                                            cwof.c("PeopleGalProvider", "Resource not found for directory_name");
                                            if (!fgrcVar.b.L()) {
                                                fgrcVar.U();
                                            }
                                            enkp enkpVar5 = (enkp) fgrcVar.b;
                                            enkp enkpVar6 = enkp.a;
                                            enkpVar5.d = 18;
                                            enkpVar5.b |= 2;
                                        }
                                    }
                                    i2 = i;
                                }
                                if (ftzi.h() && i2 != 0) {
                                    if (!fgrcVar.b.L()) {
                                        fgrcVar.U();
                                    }
                                    enkp enkpVar7 = (enkp) fgrcVar.b;
                                    enkp enkpVar8 = enkp.a;
                                    enkpVar7.b |= 512;
                                    enkpVar7.j = i2;
                                }
                            } catch (Resources.NotFoundException unused) {
                                if (ftzi.k() && ftzi.i()) {
                                    objArr[i3] = Integer.valueOf(i);
                                    cwof.c("PeopleGalProvider", "Resource not found for directory_name");
                                    if (!fgrcVar.b.L()) {
                                        fgrcVar.U();
                                    }
                                    enkp enkpVar9 = (enkp) fgrcVar.b;
                                    enkp enkpVar10 = enkp.a;
                                    enkpVar9.d = 18;
                                    enkpVar9.b |= 2;
                                }
                            }
                        } else if ("displayName".equals(str2)) {
                            int indexOf = str.indexOf(64);
                            if (indexOf == -1 || indexOf >= str.length() - 2) {
                                objArr[i3] = str;
                            } else {
                                objArr[i3] = Character.toUpperCase(str.charAt(indexOf + 1)) + str.substring(indexOf + 2);
                            }
                        } else if ("exportSupport".equals(str2)) {
                            objArr[i3] = 1;
                        } else if ("shortcutSupport".equals(str2)) {
                            objArr[i3] = 0;
                        } else if ("photoSupport".equals(str2)) {
                            objArr[i3] = 3;
                        }
                    }
                }
                matrixCursor.addRow(objArr);
            }
        }
        if (ftzi.j()) {
            int count = matrixCursor.getCount();
            if (!fgrcVar.b.L()) {
                fgrcVar.U();
            }
            enkp enkpVar11 = (enkp) fgrcVar.b;
            enkp enkpVar12 = enkp.a;
            enkpVar11.b |= 32;
            enkpVar11.g = count;
        }
        return matrixCursor;
    }

    private final Cursor j(Uri uri, final int i, final String[] strArr, final String str, final Account account, final boolean z, final fgrc fgrcVar) {
        String queryParameter = uri.getQueryParameter("limit");
        long a = ftzi.a.lK().a();
        if (queryParameter != null) {
            try {
                a = Long.parseLong(queryParameter);
            } catch (NumberFormatException e) {
                f(fgrcVar, e);
                cwof.l("PeopleGalProvider", a.a(queryParameter, "query: invalid limit parameter: '", "'"));
            }
        }
        final long j = a;
        final boolean z2 = i == 5;
        final String encode = Uri.encode(uri.getLastPathSegment());
        final String g = g(uri);
        return (Cursor) cwqp.a(this.c, new Callable() { // from class: cwqw
            /* JADX WARN: Removed duplicated region for block: B:114:0x02a3  */
            /* JADX WARN: Removed duplicated region for block: B:116:0x02aa  */
            /* JADX WARN: Removed duplicated region for block: B:118:0x02b0  */
            /* JADX WARN: Removed duplicated region for block: B:120:0x02b4  */
            /* JADX WARN: Removed duplicated region for block: B:131:0x02ff  */
            /* JADX WARN: Removed duplicated region for block: B:134:0x0309  */
            /* JADX WARN: Removed duplicated region for block: B:137:0x0316  */
            /* JADX WARN: Removed duplicated region for block: B:174:0x0556  */
            /* JADX WARN: Removed duplicated region for block: B:177:0x05d0  */
            /* JADX WARN: Removed duplicated region for block: B:181:0x0658 A[EDGE_INSN: B:181:0x0658->B:182:0x0658 BREAK  A[LOOP:1: B:92:0x0224->B:107:0x0620], SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:193:0x0559  */
            /* JADX WARN: Removed duplicated region for block: B:196:0x044f  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 1826
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cwqw.call():java.lang.Object");
            }
        }, "GalFilterThread", ftzi.b());
    }

    public final atwh b(Account account) {
        atwh a = cwpw.a(this.e, account);
        if (this.a == null) {
            Context context = this.e;
            this.a = cwqd.a(context, context.getApplicationInfo().uid);
        }
        return a;
    }

    public final Account d(String str, fgrc fgrcVar) {
        if (str == null) {
            if (!fgrcVar.b.L()) {
                fgrcVar.U();
            }
            enkp enkpVar = (enkp) fgrcVar.b;
            enkp enkpVar2 = enkp.a;
            enkpVar.d = 4;
            enkpVar.b |= 2;
            cwof.c("PeopleGalProvider", "Account name cannot be null.");
            return null;
        }
        for (Account account : this.d.p("com.google")) {
            if (account.name.equals(str)) {
                return account;
            }
        }
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        enkp enkpVar3 = (enkp) fgrcVar.b;
        enkp enkpVar4 = enkp.a;
        enkpVar3.d = 5;
        enkpVar3.b |= 2;
        cwof.c("PeopleGalProvider", "Account not found: ".concat(str));
        return null;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public final Cursor e(String[] strArr, String str, String str2, long j, boolean z, fgrc fgrcVar, String str3) {
        MatrixCursor matrixCursor;
        int i;
        List k;
        List k2;
        List k3;
        List k4;
        List k5;
        List k6;
        List k7;
        List k8;
        List k9;
        List k10;
        List k11;
        List k12;
        List k13;
        List k14;
        List l;
        List k15;
        List k16;
        List k17;
        List k18;
        String str4 = str;
        if (str4 == null) {
            cwof.c("PeopleGalProvider", "lookup key cannot be null.");
            if (!fgrcVar.b.L()) {
                fgrcVar.U();
            }
            enkp enkpVar = (enkp) fgrcVar.b;
            enkp enkpVar2 = enkp.a;
            enkpVar.d = 6;
            enkpVar.b |= 2;
            return new MatrixCursor(strArr);
        }
        Account d = d(str2, fgrcVar);
        if (d == null) {
            return new MatrixCursor(strArr);
        }
        ftzi ftziVar = ftzi.a;
        if (ftziVar.lK().l() && str4.startsWith("people-v2:")) {
            str4 = str4.substring(10);
        }
        ewpd ewpdVar = (ewpd) ewpe.a.v();
        fgrc v = ewqh.a.v();
        fgrc a = cwqr.a(str3);
        if (!v.b.L()) {
            v.U();
        }
        ewqh ewqhVar = (ewqh) v.b;
        ewof ewofVar = (ewof) a.Q();
        ewofVar.getClass();
        ewqhVar.c = ewofVar;
        ewqhVar.b |= 1;
        if (!ewpdVar.b.L()) {
            ewpdVar.U();
        }
        ewpe ewpeVar = (ewpe) ewpdVar.b;
        ewqh ewqhVar2 = (ewqh) v.Q();
        ewqhVar2.getClass();
        ewpeVar.f = ewqhVar2;
        ewpeVar.b |= 8;
        ewqr ewqrVar = ewqr.b;
        ewqp ewqpVar = (ewqp) ewqrVar.v();
        fgqs fgqsVar = (fgqs) fgqt.a.v();
        fgqsVar.k("person.name");
        fgqsVar.k("person.about");
        fgqsVar.k("person.nickname");
        fgqsVar.k("person.birthday");
        fgqsVar.k("person.gender");
        fgqsVar.k("person.occupation");
        fgqsVar.k("person.other_keyword");
        fgqsVar.k("person.email");
        fgqsVar.k("person.address");
        fgqsVar.k("person.im");
        fgqsVar.k("person.organization");
        fgqsVar.k("person.contact_group_membership");
        fgqsVar.k("person.interest");
        fgqsVar.k("person.user_defined");
        fgqsVar.k("person.language");
        fgqsVar.k("person.external_id");
        fgqsVar.k("person.phone");
        fgqsVar.k("person.website");
        fgqsVar.k("person.relation");
        fgqsVar.k("person.event");
        fgqsVar.k("person.sip_address");
        fgqsVar.k("person.client_data");
        fgqsVar.k("person.photo");
        if (ftziVar.lK().x()) {
            fgqsVar.k("person.pronoun");
        }
        if (!ewqpVar.b.L()) {
            ewqpVar.U();
        }
        ewqr ewqrVar2 = (ewqr) ewqpVar.b;
        fgqt fgqtVar = (fgqt) fgqsVar.Q();
        fgqtVar.getClass();
        ewqrVar2.d = fgqtVar;
        ewqrVar2.c |= 1;
        ewqpVar.a(ewqs.DOMAIN_PROFILE);
        ewqpVar.a(ewqs.PROFILE);
        ewqpVar.a(ewqs.DOMAIN_CONTACT);
        if (!ewpdVar.b.L()) {
            ewpdVar.U();
        }
        ewpe ewpeVar2 = (ewpe) ewpdVar.b;
        ewqr ewqrVar3 = (ewqr) ewqpVar.Q();
        ewqrVar3.getClass();
        ewpeVar2.d = ewqrVar3;
        ewpeVar2.b |= 2;
        ewpdVar.a(str4);
        if (ftziVar.lK().j()) {
            ewqr ewqrVar4 = ((ewpe) ewpdVar.b).d;
            if (ewqrVar4 != null) {
                ewqrVar = ewqrVar4;
            }
            fgrc fgrcVar2 = (fgrc) ewqrVar.iQ(5, null);
            fgrcVar2.X(ewqrVar);
            ewqp ewqpVar2 = (ewqp) fgrcVar2;
            ewqpVar2.a(ewqs.CONTACT);
            ewqr ewqrVar5 = (ewqr) ewqpVar2.Q();
            if (!ewpdVar.b.L()) {
                ewpdVar.U();
            }
            ewpe ewpeVar3 = (ewpe) ewpdVar.b;
            ewqrVar5.getClass();
            ewpeVar3.d = ewqrVar5;
            ewpeVar3.b |= 2;
        }
        try {
            ewpi b2 = this.a.b(b(d), (ewpe) ewpdVar.Q());
            if (b2.b.isEmpty() || (((ewql) b2.b.get(0)).b & 2) == 0) {
                cwof.c("PeopleGalProvider", a.a(str2, "Can't find person: ", " for the given lookup key"));
                if (!fgrcVar.b.L()) {
                    fgrcVar.U();
                }
                enkp enkpVar3 = (enkp) fgrcVar.b;
                enkp enkpVar4 = enkp.a;
                enkpVar3.d = 7;
                enkpVar3.b |= 2;
                return new MatrixCursor(strArr);
            }
            eiuc eiucVar = ((ewql) b2.b.get(0)).d;
            if (eiucVar == null) {
                eiucVar = eiuc.a;
            }
            HashMap hashMap = new HashMap();
            for (int i2 = 0; i2 < strArr.length; i2++) {
                hashMap.put(strArr[i2], Integer.valueOf(i2));
            }
            ArrayList arrayList = new ArrayList();
            String str5 = eiucVar.c;
            cvyk cvykVar = cvyk.a;
            if (!eiucVar.f.isEmpty() && (k18 = cvykVar.k(eiucVar.f, str5)) != null && !k18.isEmpty()) {
                arrayList.add(cwqx.b(hashMap, (ContentValues) k18.get(0), j));
            }
            if (!eiucVar.m.isEmpty() && (k17 = cvykVar.k(eiucVar.m, str5)) != null && !k17.isEmpty()) {
                arrayList.add(cwqx.b(hashMap, (ContentValues) k17.get(0), j));
            }
            if (!eiucVar.v.isEmpty() && (k16 = cvykVar.k(eiucVar.v, str5)) != null && !k16.isEmpty()) {
                arrayList.add(cwqx.b(hashMap, (ContentValues) k16.get(0), j));
            }
            if (!eiucVar.l.isEmpty() && (k15 = cvykVar.k(eiucVar.l, str5)) != null && !k15.isEmpty()) {
                arrayList.add(cwqx.b(hashMap, (ContentValues) k15.get(0), j));
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            cxhm.e(eiucVar.j, eiucVar.v, eiucVar.w, eiucVar.F, arrayList2, arrayList3);
            int size = arrayList3.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(cwqx.b(hashMap, (ContentValues) arrayList3.get(i3), j));
            }
            if (!eiucVar.h.isEmpty() && (l = cvyk.l(eiucVar.h, str5)) != null && !l.isEmpty()) {
                Iterator it = l.iterator();
                while (it.hasNext()) {
                    arrayList.add(cwqx.b(hashMap, (ContentValues) it.next(), j));
                }
            }
            if (!eiucVar.n.isEmpty() && (k14 = cvykVar.k(eiucVar.n, str5)) != null && !k14.isEmpty()) {
                Iterator it2 = k14.iterator();
                while (it2.hasNext()) {
                    arrayList.add(cwqx.b(hashMap, (ContentValues) it2.next(), j));
                }
            }
            if (!eiucVar.s.isEmpty() && (k13 = cvykVar.k(eiucVar.s, str5)) != null && !k13.isEmpty()) {
                Iterator it3 = k13.iterator();
                while (it3.hasNext()) {
                    arrayList.add(cwqx.b(hashMap, (ContentValues) it3.next(), j));
                }
            }
            if (!eiucVar.x.isEmpty() && (k12 = cvykVar.k(eiucVar.x, str5)) != null && !k12.isEmpty()) {
                Iterator it4 = k12.iterator();
                while (it4.hasNext()) {
                    arrayList.add(cwqx.b(hashMap, (ContentValues) it4.next(), j));
                }
            }
            if (!eiucVar.p.isEmpty() && (k11 = cvykVar.k(eiucVar.p, str5)) != null && !k11.isEmpty()) {
                Iterator it5 = k11.iterator();
                while (it5.hasNext()) {
                    arrayList.add(cwqx.b(hashMap, (ContentValues) it5.next(), j));
                }
            }
            if (!eiucVar.t.isEmpty() && (k10 = cvykVar.k(eiucVar.t, str5)) != null && !k10.isEmpty()) {
                Iterator it6 = k10.iterator();
                while (it6.hasNext()) {
                    arrayList.add(cwqx.b(hashMap, (ContentValues) it6.next(), j));
                }
            }
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                arrayList.add(cwqx.b(hashMap, (ContentValues) arrayList2.get(i4), j));
            }
            if (!eiucVar.E.isEmpty() && (k9 = cvykVar.k(eiucVar.E, str5)) != null && !k9.isEmpty()) {
                Iterator it7 = k9.iterator();
                while (it7.hasNext()) {
                    arrayList.add(cwqx.b(hashMap, (ContentValues) it7.next(), j));
                }
            }
            if (!eiucVar.u.isEmpty() && (k8 = cvykVar.k(eiucVar.u, str5)) != null && !k8.isEmpty()) {
                Iterator it8 = k8.iterator();
                while (it8.hasNext()) {
                    arrayList.add(cwqx.b(hashMap, (ContentValues) it8.next(), j));
                }
            }
            if (!eiucVar.q.isEmpty() && (k7 = cvykVar.k(eiucVar.q, str5)) != null && !k7.isEmpty()) {
                Iterator it9 = k7.iterator();
                while (it9.hasNext()) {
                    arrayList.add(cwqx.b(hashMap, (ContentValues) it9.next(), j));
                }
            }
            if (!eiucVar.i.isEmpty() && (k6 = cvykVar.k(eiucVar.i, str5)) != null && !k6.isEmpty()) {
                Iterator it10 = k6.iterator();
                while (it10.hasNext()) {
                    arrayList.add(cwqx.b(hashMap, (ContentValues) it10.next(), j));
                }
            }
            if (!eiucVar.A.isEmpty() && (k5 = cvykVar.k(eiucVar.A, str5)) != null && !k5.isEmpty()) {
                Iterator it11 = k5.iterator();
                while (it11.hasNext()) {
                    arrayList.add(cwqx.b(hashMap, (ContentValues) it11.next(), j));
                }
            }
            if (!eiucVar.z.isEmpty() && (k4 = cvykVar.k(eiucVar.z, str5)) != null && !k4.isEmpty()) {
                Iterator it12 = k4.iterator();
                while (it12.hasNext()) {
                    arrayList.add(cwqx.b(hashMap, (ContentValues) it12.next(), j));
                }
            }
            if (!eiucVar.C.isEmpty() && (k3 = cvykVar.k(eiucVar.C, str5)) != null && !k3.isEmpty()) {
                Iterator it13 = k3.iterator();
                while (it13.hasNext()) {
                    arrayList.add(cwqx.b(hashMap, (ContentValues) it13.next(), j));
                }
            }
            if (!eiucVar.D.isEmpty() && (k2 = cvykVar.k(eiucVar.D, str5)) != null && !k2.isEmpty()) {
                Iterator it14 = k2.iterator();
                while (it14.hasNext()) {
                    arrayList.add(cwqx.b(hashMap, (ContentValues) it14.next(), j));
                }
            }
            if (!eiucVar.y.isEmpty() && (k = cvykVar.k(eiucVar.y, str5)) != null && !k.isEmpty()) {
                Iterator it15 = k.iterator();
                while (it15.hasNext()) {
                    arrayList.add(cwqx.b(hashMap, (ContentValues) it15.next(), j));
                }
            }
            List d2 = cxhm.d((eist[]) eiucVar.o.toArray(new eist[0]));
            if (d2 != null && !d2.isEmpty()) {
                Iterator it16 = d2.iterator();
                while (it16.hasNext()) {
                    arrayList.add(cwqx.b(hashMap, (ContentValues) it16.next(), j));
                }
            }
            if (arrayList.isEmpty()) {
                matrixCursor = null;
            } else {
                Object[] objArr = (Object[]) arrayList.get(0);
                cwqx.a(objArr, hashMap, "contact_id", Long.valueOf(j));
                Pair a2 = cwqq.a(eiucVar);
                if (a2 != null) {
                    String b3 = cwqq.b(eiucVar, (String) a2.first);
                    cwqx.a(objArr, hashMap, "display_name", a2.first);
                    cwqx.a(objArr, hashMap, "display_name_source", a2.second);
                    cwqx.a(objArr, hashMap, "display_name_alt", b3);
                }
                cwqx.a(objArr, hashMap, "account_type", "com.google");
                cwqx.a(objArr, hashMap, "account_name", str2);
                cwqx.a(objArr, hashMap, "raw_contact_is_read_only", 1);
                cwqx.a(objArr, hashMap, "is_read_only", 1);
                if (c(eiucVar)) {
                    i = 0;
                    Uri a3 = a(str2, false, eiucVar.c, z);
                    cwqx.a(objArr, hashMap, "photo_uri", a3 == null ? null : a3.toString());
                    Uri a4 = a(str2, true, eiucVar.c, z);
                    cwqx.a(objArr, hashMap, "photo_thumb_uri", a4 == null ? null : a4.toString());
                } else {
                    i = 0;
                }
                matrixCursor = new MatrixCursor(strArr, arrayList.size());
                while (i < arrayList.size()) {
                    int i5 = i + 1;
                    Object[] objArr2 = (Object[]) arrayList.get(i);
                    if (objArr2 != null) {
                        cwqx.a(objArr2, hashMap, "data_id", Integer.valueOf(i5));
                        matrixCursor.addRow(objArr2);
                    }
                    i = i5;
                }
            }
            if (matrixCursor != null) {
                int count = matrixCursor.getCount();
                if (!fgrcVar.b.L()) {
                    fgrcVar.U();
                }
                enkp enkpVar5 = (enkp) fgrcVar.b;
                enkp enkpVar6 = enkp.a;
                enkpVar5.b |= 32;
                enkpVar5.g = count;
            }
            return matrixCursor;
        } catch (fwuc e) {
            if (!fgrcVar.b.L()) {
                fgrcVar.U();
            }
            enkp enkpVar7 = (enkp) fgrcVar.b;
            enkp enkpVar8 = enkp.a;
            enkpVar7.d = 14;
            enkpVar7.b |= 2;
            int i6 = e.a.t.r;
            if (!fgrcVar.b.L()) {
                fgrcVar.U();
            }
            enkp enkpVar9 = (enkp) fgrcVar.b;
            enkpVar9.b |= 16;
            enkpVar9.f = i6;
            f(fgrcVar, e);
            cwof.c("PeopleGalProvider", "Error getPeople grpc response: ".concat(e.toString()));
            return new MatrixCursor(strArr);
        } catch (wjw e2) {
            if (!fgrcVar.b.L()) {
                fgrcVar.U();
            }
            enkp enkpVar10 = (enkp) fgrcVar.b;
            enkp enkpVar11 = enkp.a;
            enkpVar10.d = 3;
            enkpVar10.b |= 2;
            f(fgrcVar, e2);
            cwof.c("PeopleGalProvider", "Error getPeople grpc response: ".concat(e2.toString()));
            return new MatrixCursor(strArr);
        }
    }

    @Override // com.google.android.chimera.ContentProvider
    public final String getType(Uri uri) {
        if (b.match(uri) == 1) {
            return "vnd.android.cursor.item/contact";
        }
        return null;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.chimera.ContentProvider
    public final boolean onCreate() {
        Context context = this.e;
        if (context == null) {
            context = getContext();
        }
        this.e = context;
        this.d = bsup.b(context);
        return true;
    }

    @Override // com.google.android.chimera.ContentProvider
    public final ParcelFileDescriptor openFile(final Uri uri, String str) {
        String.valueOf(uri);
        final fgrc v = enkp.a.v();
        if (!v.b.L()) {
            v.U();
        }
        enkp enkpVar = (enkp) v.b;
        enkpVar.c = 8;
        enkpVar.b |= 1;
        String str2 = null;
        r4 = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        try {
            final Account d = d(uri.getQueryParameter("account_name"), v);
            if (d == null) {
                cwof.f("PeopleGalProvider", "OpenFile method completed.");
                fgri fgriVar = v.b;
                int a = enzm.a(((enkp) fgriVar).d);
                if (a == 0 || a == 1) {
                    if (!fgriVar.L()) {
                        v.U();
                    }
                    enkp enkpVar2 = (enkp) v.b;
                    enkpVar2.d = 1;
                    enkpVar2.b |= 2;
                    cwof.f("PeopleGalProvider", "OpenFile method finished successfully");
                }
                cvts.a().h((enkp) v.Q(), null);
                return null;
            }
            String str3 = d.name;
            try {
                if (!"r".equals(str)) {
                    if (!v.b.L()) {
                        v.U();
                    }
                    enkp enkpVar3 = (enkp) v.b;
                    enkpVar3.d = 10;
                    enkpVar3.b |= 2;
                    cwof.c("PeopleGalProvider", "mode must be \"r\"");
                } else if (cxdf.a(this.e).b()) {
                    parcelFileDescriptor = (ParcelFileDescriptor) cwqp.a(this.c, new Callable() { // from class: cwqs
                        /* JADX WARN: Removed duplicated region for block: B:46:0x01e3  */
                        /* JADX WARN: Removed duplicated region for block: B:48:0x01e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                        @Override // java.util.concurrent.Callable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object call() {
                            /*
                                Method dump skipped, instructions count: 548
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.cwqs.call():java.lang.Object");
                        }
                    }, "GalOpenFileThread", ftzi.e());
                } else {
                    if (!v.b.L()) {
                        v.U();
                    }
                    enkp enkpVar4 = (enkp) v.b;
                    enkpVar4.d = 2;
                    enkpVar4.b |= 2;
                    cwof.c("PeopleGalProvider", "Don't have Contacts permission.");
                }
                cwof.f("PeopleGalProvider", "OpenFile method completed.");
                fgri fgriVar2 = v.b;
                int a2 = enzm.a(((enkp) fgriVar2).d);
                if (a2 == 0 || a2 == 1) {
                    if (!fgriVar2.L()) {
                        v.U();
                    }
                    enkp enkpVar5 = (enkp) v.b;
                    enkpVar5.d = 1;
                    enkpVar5.b |= 2;
                    cwof.f("PeopleGalProvider", "OpenFile method finished successfully");
                }
                cvts.a().h((enkp) v.Q(), str3);
                return parcelFileDescriptor;
            } catch (Throwable th) {
                th = th;
                str2 = str3;
                cwof.f("PeopleGalProvider", "OpenFile method completed.");
                fgri fgriVar3 = v.b;
                int a3 = enzm.a(((enkp) fgriVar3).d);
                if (a3 == 0 || a3 == 1) {
                    if (!fgriVar3.L()) {
                        v.U();
                    }
                    enkp enkpVar6 = (enkp) v.b;
                    enkpVar6.d = 1;
                    enkpVar6.b |= 2;
                    cwof.f("PeopleGalProvider", "OpenFile method finished successfully");
                }
                cvts.a().h((enkp) v.Q(), str2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:177:0x095d, code lost:
    
        if (r4 == 1) goto L464;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a0, code lost:
    
        if (r8.b.L() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x04fa, code lost:
    
        if (r8.b.L() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a2, code lost:
    
        r8.U();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a5, code lost:
    
        defpackage.enkp.b((defpackage.enkp) r8.b, r4);
        r0 = defpackage.cvts.a();
        r2 = r8.Q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x07b5, code lost:
    
        if (r8.b.L() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x01b3, code lost:
    
        if (r8.b.L() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0133, code lost:
    
        if (r8.b.L() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0244, code lost:
    
        if (r8.b.L() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0925, code lost:
    
        if (r8.b.L() == false) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0944  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x095a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0965  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x097c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0993  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x095c  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c5 A[Catch: all -> 0x0929, Exception -> 0x092c, TryCatch #23 {Exception -> 0x092c, all -> 0x0929, blocks: (B:3:0x0020, B:5:0x0029, B:7:0x0031, B:9:0x0039, B:10:0x003c, B:32:0x00bc, B:34:0x00c6, B:36:0x00ce, B:37:0x00d1, B:57:0x01bd, B:59:0x01c5, B:60:0x01c8, B:62:0x01d7, B:64:0x01df, B:65:0x01e2, B:81:0x0248, B:183:0x0479, B:185:0x048f, B:186:0x0492, B:203:0x04fe, B:230:0x0589, B:436:0x013c, B:438:0x0146, B:440:0x014e, B:441:0x0151), top: B:2:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d7 A[Catch: all -> 0x0929, Exception -> 0x092c, TryCatch #23 {Exception -> 0x092c, all -> 0x0929, blocks: (B:3:0x0020, B:5:0x0029, B:7:0x0031, B:9:0x0039, B:10:0x003c, B:32:0x00bc, B:34:0x00c6, B:36:0x00ce, B:37:0x00d1, B:57:0x01bd, B:59:0x01c5, B:60:0x01c8, B:62:0x01d7, B:64:0x01df, B:65:0x01e2, B:81:0x0248, B:183:0x0479, B:185:0x048f, B:186:0x0492, B:203:0x04fe, B:230:0x0589, B:436:0x013c, B:438:0x0146, B:440:0x014e, B:441:0x0151), top: B:2:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0248 A[Catch: all -> 0x0929, Exception -> 0x092c, TRY_ENTER, TRY_LEAVE, TryCatch #23 {Exception -> 0x092c, all -> 0x0929, blocks: (B:3:0x0020, B:5:0x0029, B:7:0x0031, B:9:0x0039, B:10:0x003c, B:32:0x00bc, B:34:0x00c6, B:36:0x00ce, B:37:0x00d1, B:57:0x01bd, B:59:0x01c5, B:60:0x01c8, B:62:0x01d7, B:64:0x01df, B:65:0x01e2, B:81:0x0248, B:183:0x0479, B:185:0x048f, B:186:0x0492, B:203:0x04fe, B:230:0x0589, B:436:0x013c, B:438:0x0146, B:440:0x014e, B:441:0x0151), top: B:2:0x0020 }] */
    /* JADX WARN: Type inference failed for: r20v0, types: [com.google.android.gms.people.service.galprovider.PeopleGalChimeraProvider] */
    /* JADX WARN: Type inference failed for: r2v116, types: [cvts] */
    /* JADX WARN: Type inference failed for: r2v137, types: [cvts] */
    /* JADX WARN: Type inference failed for: r4v17, types: [int] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v38, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v40, types: [java.lang.String] */
    @Override // com.google.android.chimera.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.database.Cursor query(android.net.Uri r21, final java.lang.String[] r22, java.lang.String r23, java.lang.String[] r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 2494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.people.service.galprovider.PeopleGalChimeraProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    @Override // com.google.android.chimera.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public PeopleGalChimeraProvider(Context context, cwqd cwqdVar) {
        this.e = context;
        this.a = cwqdVar;
    }
}
