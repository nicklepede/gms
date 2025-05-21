package com.google.android.gms.googlehelp.contact.chat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Pair;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.chimera.Service;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.GcmChimeraBroadcastReceiver;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.arwm;
import defpackage.asbo;
import defpackage.asej;
import defpackage.asmf;
import defpackage.asot;
import defpackage.asqh;
import defpackage.bipo;
import defpackage.bipq;
import defpackage.bipx;
import defpackage.biqb;
import defpackage.biqm;
import defpackage.biqq;
import defpackage.biqr;
import defpackage.birs;
import defpackage.birv;
import defpackage.bisi;
import defpackage.bitk;
import defpackage.biuk;
import defpackage.biun;
import defpackage.biuo;
import defpackage.biup;
import defpackage.bivk;
import defpackage.bixb;
import defpackage.bjaw;
import defpackage.bjay;
import defpackage.bjbk;
import defpackage.bjbu;
import defpackage.bjcf;
import defpackage.bjcn;
import defpackage.bjcq;
import defpackage.bjcr;
import defpackage.bjeg;
import defpackage.bjij;
import defpackage.deqh;
import defpackage.dfak;
import defpackage.dfee;
import defpackage.eiid;
import defpackage.eivv;
import defpackage.ejhf;
import defpackage.ensv;
import defpackage.fefl;
import defpackage.fhed;
import defpackage.folt;
import defpackage.fomm;
import defpackage.fonq;
import defpackage.fonz;
import defpackage.foor;
import defpackage.foqq;
import defpackage.fosp;
import defpackage.ijw;
import defpackage.ikb;
import defpackage.ikd;
import defpackage.iks;
import defpackage.ili;
import defpackage.iln;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class ChatRequestAndConversationChimeraService extends Service implements biun, bipo, birs {
    public static final asot a = asot.b("gH_ChatReq&ConvoSvc", asej.GOOGLE_HELP);
    public static final String b = "com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationService";
    static final Set c = new HashSet();
    private Long A;
    private BroadcastReceiver B;
    private ikd C;
    asbo d;
    public boolean e;
    public HelpConfig f;
    public bjay g;
    public bipq h;
    public boolean i;
    public biqq s;
    private ensv u;
    private boolean w;
    private List z;
    private biqq v = new biqq();
    public boolean j = false;
    private boolean x = false;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    private CharSequence y = "";
    public biuk n = null;
    public long o = -1;
    public long p = -1;
    public long q = -1;
    public long r = 0;
    public boolean t = false;

    public static void C(Context context, HelpConfig helpConfig) {
        D(context, helpConfig, false);
    }

    public static void D(Context context, HelpConfig helpConfig, boolean z) {
        Intent putExtra = new Intent().setClassName(context, b).putExtra("EXTRA_HELP_CONFIG", helpConfig);
        if (z) {
            putExtra.putExtra("EXTRA_IGNORE_CHAT_QUEUE_STATUS", true);
        }
        context.startService(putExtra);
    }

    public static void K(String str, long j, String str2, String str3, Context context, HelpConfig helpConfig) {
        Intent putExtra = new Intent().setClassName(context, b).putExtra("EXTRA_REQUEST_TYPE_SEND_CHAT_CONVERSATION_MESSAGE", true).putExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_CONTENT", str).putExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_CLIENT_TIME", j).putExtra("EXTRA_HELP_CONFIG", helpConfig);
        if (bivk.b(fonz.c())) {
            putExtra.putExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_SMART_REPLY_PREDICTION_ID", str2).putExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_SMART_REPLY_ACCEPTED_RECOMMENDATION_ID", str3);
        }
        context.startService(putExtra);
    }

    public static void M(Context context, HelpConfig helpConfig) {
        context.startService(new Intent().setClassName(context, b).putExtra("EXTRA_REQUEST_TYPE_UPDATE_CHAT_CONVERSATION", true).putExtra("EXTRA_HELP_CONFIG", helpConfig));
    }

    public static void N(boolean z, Context context, HelpConfig helpConfig) {
        context.startService(new Intent().setClassName(context, b).putExtra("EXTRA_REQUEST_TYPE_UPDATE_IS_CHAT_IN_FOREGROUND", true).putExtra("EXTRA_IS_CHAT_IN_FOREGROUND", z).putExtra("EXTRA_HELP_CONFIG", helpConfig));
    }

    static final void S() {
        bivk.a(foqq.a.a().a());
    }

    private static Pair T() {
        return Pair.create(true, 2);
    }

    private static Pair U() {
        return Pair.create(false, 0);
    }

    private static String V(bjcf bjcfVar) {
        String str = bjcfVar.d;
        return (!TextUtils.isEmpty(str) || bjcfVar.f.size() <= 0) ? str : ((fhed) bjcfVar.f.get(0)).h;
    }

    private static void W() {
        Handler handler;
        Runnable runnable;
        if (bivk.a(folt.c())) {
            Set<biuo> set = c;
            for (biuo biuoVar : set) {
                if (bivk.a(folt.c()) && (handler = biuoVar.f) != null && (runnable = biuoVar.g) != null) {
                    handler.removeCallbacks(runnable);
                    biuoVar.f = null;
                    biuoVar.g = null;
                }
            }
            set.clear();
        }
    }

    private final void X(final Intent intent) {
        if (bivk.b(fomm.a.a().p())) {
            new biqm().a().w(p(), new dfak() { // from class: bitt
                @Override // defpackage.dfak
                public final void gn(Object obj) {
                    final eiid eiidVar = (eiid) obj;
                    if (eiidVar.h()) {
                        final Intent intent2 = intent;
                        final ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = ChatRequestAndConversationChimeraService.this;
                        chatRequestAndConversationChimeraService.t(new bipo() { // from class: bitr
                            @Override // defpackage.bipo
                            public final void b(bipq bipqVar) {
                                HelpConfig helpConfig = (HelpConfig) eiidVar.c();
                                if (bitk.e(helpConfig, bipqVar) == -1) {
                                    helpConfig.I = "";
                                    helpConfig.N = "";
                                }
                                Intent intent3 = intent2;
                                ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService2 = ChatRequestAndConversationChimeraService.this;
                                bitk.C(chatRequestAndConversationChimeraService2, helpConfig);
                                if (TextUtils.isEmpty(helpConfig.I) || TextUtils.isEmpty(helpConfig.N)) {
                                    new bivb(chatRequestAndConversationChimeraService2, helpConfig, chatRequestAndConversationChimeraService2.g, intent3).executeOnExecutor(chatRequestAndConversationChimeraService2.p(), new Void[0]);
                                    return;
                                }
                                Intent intent4 = new Intent(intent3);
                                intent4.putExtra("EXTRA_HELP_CONFIG", helpConfig);
                                GcmChimeraBroadcastReceiver.startWakefulService(chatRequestAndConversationChimeraService2, intent4);
                            }
                        });
                        chatRequestAndConversationChimeraService.G((HelpConfig) eiidVar.c());
                    }
                }
            });
        }
    }

    private static boolean Y(int i) {
        return i > 0;
    }

    private final boolean Z() {
        HelpConfig helpConfig = this.f;
        if (helpConfig == null) {
            ((ejhf) a.j()).x("Got request to update conversation, but no configurations available.");
            return false;
        }
        if (bjeg.c(helpConfig) && (TextUtils.isEmpty(this.f.N) || bitk.h(this.f, this.h) == null)) {
            return false;
        }
        if (Y(a())) {
            E();
            return true;
        }
        t(new bipo() { // from class: biue
            @Override // defpackage.bipo
            public final void b(bipq bipqVar) {
                ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = ChatRequestAndConversationChimeraService.this;
                new biuu(bipqVar, chatRequestAndConversationChimeraService, chatRequestAndConversationChimeraService.f, chatRequestAndConversationChimeraService.g).executeOnExecutor(chatRequestAndConversationChimeraService.p(), new Void[0]);
            }
        });
        return true;
    }

    public static long e() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    public static CharSequence q(PackageManager packageManager, HelpConfig helpConfig) {
        if (packageManager == null) {
            ((ejhf) a.j()).x("Trying to get an app package name, but packageManager is null");
            return null;
        }
        if (helpConfig == null) {
            ((ejhf) a.j()).x("Trying to get an app package name, but config is null");
            return null;
        }
        try {
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(helpConfig.b, 0));
        } catch (PackageManager.NameNotFoundException unused) {
            ((ejhf) a.i()).B("App product name was not found for %s.", helpConfig.b);
            return null;
        }
    }

    @Override // defpackage.biun
    public final void A() {
        int a2;
        if (!this.i || this.f == null || (a2 = a()) < 0) {
            return;
        }
        if (a2 != 0) {
            x(4102, dfee.GOOGLEHELP_CHAT_STATUS_UPDATE_NOTIFICATION, j());
        }
        J(l().putExtra("EXTRA_IS_CHAT_SUPPORT_STATUS_UPDATE", true).putExtra("EXTRA_CHAT_SUPPORT_QUEUE_POSITION", a2));
    }

    @Override // defpackage.biun
    public final void B() {
        Intent putExtra;
        this.i = false;
        if (this.e) {
            J(l().putExtra("EXTRA_WAS_CHAT_SUPPORT_ENDED", true));
        } else {
            bipq bipqVar = this.h;
            if (bipqVar == null || !bitk.F(bipqVar)) {
                bitk.D(this, this.f);
                x(2014, dfee.GOOGLEHELP_CHAT_STATUS_UPDATE_NOTIFICATION, g());
                putExtra = l().putExtra("EXTRA_IS_CHAT_SUPPORT_UNAVAILABLE", true);
            } else {
                putExtra = l().putExtra("EXTRA_WAS_CHAT_SUPPORT_ENDED", true);
            }
            J(putExtra);
        }
        stopSelf();
    }

    final void E() {
        F(false);
    }

    public final void F(boolean z) {
        arwm.s(this.f);
        long e = bitk.e(this.f, this.h);
        if (bjeg.c(this.f) && e == -1) {
            if (TextUtils.isEmpty(this.f.N)) {
                ((ejhf) a.j()).x("Got request to request chat or update queue status, but configurations are missing.");
                return;
            }
            e = -1;
        }
        if (bivk.a(folt.e()) && TextUtils.isEmpty(this.f.N)) {
            ((ejhf) a.j()).x("Got request to request chat or update queue status, but configurations are missing.");
            return;
        }
        biuo biuoVar = new biuo(this, this.f, this.g, this, this.h, z);
        if (bivk.a(folt.c()) && !bitk.E(this, this.f)) {
            c.add(biuoVar);
        }
        t(biuoVar);
        new biup(Long.valueOf(e), this, this.f, this.g, biuoVar).executeOnExecutor(p(), new Void[0]);
    }

    public final void G(HelpConfig helpConfig) {
        bipq.c(p(), this, this, helpConfig);
    }

    public final void H(final long j) {
        t(new bipo() { // from class: biud
            @Override // defpackage.bipo
            public final void b(bipq bipqVar) {
                ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = ChatRequestAndConversationChimeraService.this;
                chatRequestAndConversationChimeraService.J(chatRequestAndConversationChimeraService.n("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_TIMESTAMP_RELATED_OBJECTS").putExtra("EXTRA_DEVICE_SERVER_TIME_DIFFERENCE_ESTIMATE", j));
            }
        });
    }

    public final void I() {
        t(new bipo() { // from class: biuj
            @Override // defpackage.bipo
            public final void b(bipq bipqVar) {
                ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = ChatRequestAndConversationChimeraService.this;
                chatRequestAndConversationChimeraService.J(chatRequestAndConversationChimeraService.n("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_TIMESTAMP_RELATED_OBJECTS").putExtra("EXTRA_SHOULD_UPDATE_TIMESTAMPS", true).putExtra("EXTRA_DEVICE_SERVER_TIME_DIFFERENCE_ESTIMATE", bitk.b(chatRequestAndConversationChimeraService.h)));
            }
        });
    }

    public final void J(Intent intent) {
        sendBroadcast(intent.setPackage(getPackageName()));
    }

    final void L(final String str, final long j, final String str2, final String str3) {
        t(new bipo() { // from class: bito
            @Override // defpackage.bipo
            public final void b(bipq bipqVar) {
                String str4 = str;
                long j2 = j;
                String str5 = str2;
                String str6 = str3;
                ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = ChatRequestAndConversationChimeraService.this;
                new biva(str4, j2, str5, str6, bipqVar, chatRequestAndConversationChimeraService, chatRequestAndConversationChimeraService.f, chatRequestAndConversationChimeraService.g).executeOnExecutor(chatRequestAndConversationChimeraService.p(), new Void[0]);
            }
        });
    }

    public final void O(bipq bipqVar, boolean z) {
        List k = bitk.k(this.q, bipqVar);
        ArrayList arrayList = new ArrayList();
        int size = k.size();
        for (int i = 0; i < size; i++) {
            if (((bjbu) k.get(i)).c == 3) {
                arrayList.add((bjbu) k.get(i));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        x(4102, dfee.GOOGLEHELP_CHAT_STATUS_UPDATE_NOTIFICATION, h(arrayList, z));
    }

    final boolean P() {
        return a() == 0;
    }

    @Override // defpackage.biun
    public final boolean Q() {
        return this.i;
    }

    final void R(int i) {
        bjbk.l(this, this.f, this.g, i);
    }

    final int a() {
        arwm.s(this.f);
        HelpConfig helpConfig = this.f;
        bipq bipqVar = this.h;
        int i = bitk.a;
        if (bipqVar == null) {
            return -1;
        }
        return bipqVar.e(biqr.d(helpConfig), -1);
    }

    @Override // defpackage.bipo
    public final synchronized void b(bipq bipqVar) {
        biqq biqqVar = this.v;
        if (biqqVar == null) {
            return;
        }
        this.h = bipqVar;
        biqqVar.b();
        this.v = null;
    }

    @Override // defpackage.birs
    public final void c(bipx bipxVar) {
        List list = this.z;
        if (list == null) {
            return;
        }
        list.remove(bipxVar);
        if (this.z.isEmpty()) {
            this.z = null;
        }
    }

    final long d() {
        if (this.A == null) {
            this.A = Long.valueOf(System.currentTimeMillis());
        }
        return this.A.longValue();
    }

    @Override // defpackage.birs
    public final void f(bipx bipxVar) {
        if (this.z == null) {
            this.z = new ArrayList();
        }
        this.z.add(bipxVar);
    }

    final Notification g() {
        ikd o = o(false, false);
        o.m(s(R.string.gh_chat_request_error_notification, new Object[0]));
        o.x(s(R.string.gh_chat_request_error_notification, new Object[0]));
        o.l(r());
        o.g = k();
        o.A(d());
        return o.b();
    }

    public final Notification h(List list, boolean z) {
        PendingIntent k;
        CharSequence[] charSequenceArr;
        bjcq bjcqVar;
        long j;
        ikd o = o(true, z);
        int size = list.size();
        iks iksVar = new iks((byte[]) null);
        for (int i = 0; i < size; i++) {
            bjbu bjbuVar = (bjbu) list.get(i);
            if ((bjbuVar.b & 4) != 0) {
                fefl feflVar = bjbuVar.g;
                if (feflVar == null) {
                    feflVar = fefl.a;
                }
                j = feflVar.b;
            } else {
                j = -1;
            }
            iksVar.j(V(bjbuVar.c == 3 ? (bjcf) bjbuVar.d : bjcf.a), j, (bjbuVar.c == 3 ? (bjcf) bjbuVar.d : bjcf.a).e);
        }
        if (this.m) {
            iksVar.j(getResources().getString(R.string.gh_chat_notification_message_failed_to_send_text), System.currentTimeMillis(), getResources().getString(R.string.common_google_play_services_error_dialog_title).toUpperCase());
        }
        o.v(iksVar);
        bjbu bjbuVar2 = (bjbu) eivv.p(list);
        bjcf bjcfVar = bjbuVar2.c == 3 ? (bjcf) bjbuVar2.d : bjcf.a;
        if (!this.m && this.k) {
            if (asqh.a()) {
                if (bjcfVar != null) {
                    bjcqVar = bjcfVar.g;
                    if (bjcqVar == null) {
                        bjcqVar = bjcq.a;
                    }
                } else {
                    bjcqVar = null;
                }
                Intent putExtra = new Intent().setClassName(this, b).putExtra("EXTRA_REQUEST_TYPE_SEND_CHAT_NOTIFICATION_DIRECT_MESSAGE", true).putExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_CLIENT_TIME", System.currentTimeMillis()).putExtra("EXTRA_HELP_CONFIG", this.f);
                if (bjcqVar != null && bjcqVar.c.size() > 0) {
                    Bundle bundle = new Bundle(bjcqVar.c.size());
                    for (bjcr bjcrVar : bjcqVar.c) {
                        bundle.putString(bjcrVar.c, bjcrVar.b);
                    }
                    putExtra.putExtra("EXTRA_NOTIFICATION_SMART_REPLY_PREDICTION_ID", bjcqVar.b).putExtra("EXTRA_NOTIFICATION_SMART_REPLY_TO_RECOMMENDATION_ID_BUNDLE", bundle);
                }
                S();
                k = PendingIntent.getService(this, 10101, putExtra, 134217728);
            } else {
                k = k();
            }
            PendingIntent pendingIntent = k;
            String string = getResources().getString(R.string.gh_chat_message_input_hint);
            HashSet hashSet = new HashSet();
            Bundle bundle2 = new Bundle();
            if (bjcfVar != null) {
                bjcq bjcqVar2 = bjcfVar.g;
                if (bjcqVar2 == null) {
                    bjcqVar2 = bjcq.a;
                }
                if (bjcqVar2.c.size() > 0) {
                    bjcq bjcqVar3 = bjcfVar.g;
                    if (bjcqVar3 == null) {
                        bjcqVar3 = bjcq.a;
                    }
                    int size2 = bjcqVar3.c.size();
                    charSequenceArr = new CharSequence[size2];
                    for (int i2 = 0; i2 < size2; i2++) {
                        bjcq bjcqVar4 = bjcfVar.g;
                        if (bjcqVar4 == null) {
                            bjcqVar4 = bjcq.a;
                        }
                        charSequenceArr[i2] = ((bjcr) bjcqVar4.c.get(i2)).c;
                    }
                    bjcq bjcqVar5 = bjcfVar.g;
                    if (bjcqVar5 == null) {
                        bjcqVar5 = bjcq.a;
                    }
                    bjaw.r(bjcqVar5.b, 3, this, this.f);
                    bjcq bjcqVar6 = bjcfVar.g;
                    if (bjcqVar6 == null) {
                        bjcqVar6 = bjcq.a;
                    }
                    bjbk.o(bjcqVar6.b, 3, 211, this, this.f, this.g);
                    String string2 = getString(R.string.common_reply);
                    IconCompat o2 = IconCompat.o(null, "", 2131233111);
                    Bundle bundle3 = new Bundle();
                    CharSequence d = ikd.d(string2);
                    ili iliVar = new ili(string, charSequenceArr, bundle2, hashSet);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(iliVar);
                    o.i(ijw.a(o2, d, pendingIntent, !asqh.a(), bundle3, arrayList, true));
                }
            }
            charSequenceArr = null;
            String string22 = getString(R.string.common_reply);
            IconCompat o22 = IconCompat.o(null, "", 2131233111);
            Bundle bundle32 = new Bundle();
            CharSequence d2 = ikd.d(string22);
            ili iliVar2 = new ili(string, charSequenceArr, bundle2, hashSet);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(iliVar2);
            o.i(ijw.a(o22, d2, pendingIntent, !asqh.a(), bundle32, arrayList2, true));
        }
        String V = V(bjcfVar);
        o.m(bjcfVar.e);
        o.x(V);
        o.l(V);
        o.g = k();
        o.A(System.currentTimeMillis());
        return o.b();
    }

    public final Notification i() {
        ikd o = o(true, false);
        String s = s(R.string.gh_chat_ongoing_chat_session, new Object[0]);
        o.m(r());
        o.x(s);
        o.l(s);
        o.g = k();
        o.A(d());
        o.v(new ikb());
        return o.b();
    }

    final Notification j() {
        int a2 = this.f == null ? -1 : a();
        String s = a2 == -1 ? s(R.string.gh_chat_waiting_for_response, new Object[0]) : getString(R.string.gh_chat_queue_position, new Object[]{Integer.valueOf(a2)});
        ikd o = o(true, false);
        o.m(s);
        o.x(s);
        o.l(r());
        o.g = k();
        o.A(System.currentTimeMillis());
        return o.b();
    }

    final PendingIntent k() {
        Intent k;
        if (bivk.c(this.f.g(), fomm.g(), fomm.c(), fomm.d())) {
            if (!TextUtils.isEmpty(this.f.N) && !TextUtils.isEmpty(this.f.I)) {
                HelpConfig helpConfig = this.f;
                if (helpConfig.U) {
                    k = bjij.b(this, helpConfig, System.nanoTime());
                }
            }
            k = bjij.a(this, this.f, System.nanoTime());
        } else {
            if (bjeg.c(this.f)) {
                HelpConfig helpConfig2 = this.f;
                if (!helpConfig2.U) {
                    int i = bjij.a;
                    k = bjij.d(this, helpConfig2, !bjeg.c(helpConfig2) ? bjeg.b(this, helpConfig2, birv.e(this)) : bjeg.b(this, helpConfig2, getResources().getBoolean(R.bool.gh_is_system_dark)));
                }
            }
            k = ChatConversationChimeraActivity.k(this, this.f);
        }
        S();
        return PendingIntent.getActivity(this, 10101, k, 134217728);
    }

    final Intent l() {
        return n("com.google.android.gms.googlehelp.HelpChimeraActivity.CHAT_STATUS_UPDATE");
    }

    public final Intent m() {
        return n("com.google.android.gms.googlehelp.HelpChimeraActivity.CHAT_READY");
    }

    public final Intent n(String str) {
        Intent intent = new Intent(str);
        if (bivk.a(fosp.d())) {
            intent.setPackage(getPackageName());
        }
        return intent;
    }

    final ikd o(boolean z, boolean z2) {
        if (this.C == null) {
            ikd ikdVar = new ikd(this, "chat_channel_id");
            this.C = ikdVar;
            ikdVar.A = getColor(R.color.material_blue_grey_500);
            ikdVar.g(2131232942);
            if (asqh.a()) {
                Bundle bundle = new Bundle();
                bundle.putString("android.substName", r());
                this.C.j(bundle);
            }
        }
        boolean P = P();
        ikd ikdVar2 = this.C;
        ikdVar2.B = !P ? 1 : 0;
        boolean z3 = (z2 || this.j || (!P && z)) ? false : true;
        ikdVar2.s(!z3);
        if (z3) {
            ikd ikdVar3 = this.C;
            ikdVar3.l = 2;
            ikdVar3.n(2);
            ikdVar3.u(Settings.System.DEFAULT_NOTIFICATION_URI);
        } else {
            ikd ikdVar4 = this.C;
            ikdVar4.l = 0;
            if (!z) {
                ikdVar4.n(4);
            }
        }
        ikd ikdVar5 = this.C;
        Intent putExtra = new Intent().setClassName(this, b).putExtra("EXTRA_HELP_CONFIG", this.f).putExtra("EXTRA_REQUEST_TYPE_NOTIFICATION_DISMISSED", true);
        S();
        ikdVar5.o(PendingIntent.getService(this, 10101, putExtra, 134217728));
        this.C.b.clear();
        return this.C;
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        bixb.b(this);
        this.r = e();
        this.B = new TracingBroadcastReceiver() { // from class: com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.1
            @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
            public final void jz(Context context, Intent intent) {
                if (!"android.intent.action.TIME_SET".equals(intent.getAction())) {
                    if ("android.intent.action.TIMEZONE_CHANGED".equals(intent.getAction())) {
                        ChatRequestAndConversationChimeraService.this.w();
                        return;
                    }
                    return;
                }
                final ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = ChatRequestAndConversationChimeraService.this;
                long j = chatRequestAndConversationChimeraService.r;
                long e = ChatRequestAndConversationChimeraService.e();
                chatRequestAndConversationChimeraService.r = e;
                final long j2 = e - j;
                chatRequestAndConversationChimeraService.t(new bipo() { // from class: bity
                    @Override // defpackage.bipo
                    public final void b(bipq bipqVar) {
                        ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService2 = ChatRequestAndConversationChimeraService.this;
                        bitk.w(bitk.b(chatRequestAndConversationChimeraService2.h) + j2, chatRequestAndConversationChimeraService2.h);
                    }
                });
                chatRequestAndConversationChimeraService.w();
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        iln.b(this, this.B, intentFilter, 2);
        this.d = asbo.f(this);
        if (Build.VERSION.SDK_INT >= 26) {
            asbo asboVar = this.d;
            if (asboVar.c("chat_channel_id") == null) {
                asboVar.p(new NotificationChannel("chat_channel_id", getString(R.string.gh_top_appbar_support_label), 4));
            }
        }
        this.g = new bjay(this);
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        if (this.f != null && ((this.w || !this.i) && this.h != null)) {
            v();
        }
        stopForeground(this.w);
        List list = this.z;
        if (list != null) {
            bipx.b(false, list);
        }
        BroadcastReceiver broadcastReceiver = this.B;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
        bjay bjayVar = this.g;
        if (bjayVar != null) {
            bjayVar.close();
        }
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        Pair U;
        ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService;
        String str;
        String str2;
        String str3;
        HelpConfig helpConfig;
        HelpConfig helpConfig2;
        if (intent != null && (helpConfig2 = (HelpConfig) intent.getParcelableExtra("EXTRA_HELP_CONFIG")) != null) {
            if (bjeg.c(helpConfig2)) {
                if (this.f == null || (!TextUtils.isEmpty(helpConfig2.I) && helpConfig2.t())) {
                    this.f = helpConfig2;
                }
                HelpConfig helpConfig3 = this.f;
                if (helpConfig3 != null) {
                    helpConfig3.aa = biqb.b(this, helpConfig3);
                }
            } else {
                this.f = helpConfig2;
            }
        }
        HelpConfig helpConfig4 = this.f;
        if (helpConfig4 == null) {
            X(intent);
            ((ejhf) a.j()).x("Attempting to start Chat service, but no configurations provided.");
            return 2;
        }
        if (bjeg.c(helpConfig4)) {
            HelpConfig helpConfig5 = this.f;
            if (!helpConfig5.U && (TextUtils.isEmpty(helpConfig5.I) || !this.f.t())) {
                X(intent);
                return 2;
            }
        }
        G(this.f);
        if (intent == null) {
            U = Pair.create(true, 2);
        } else if (intent.getBooleanExtra("EXTRA_REQUEST_TYPE_NOTIFY_IF_UPDATING", false)) {
            if (Y(a())) {
                A();
            } else if (P()) {
                y();
            } else {
                Intent l = l();
                HelpConfig helpConfig6 = this.f;
                int i3 = bitk.a;
                if (biqb.d(this, helpConfig6, "should_notify_of_chat_request_error")) {
                    l.putExtra("EXTRA_IS_CHAT_SUPPORT_UNAVAILABLE", true);
                } else {
                    l.putExtra("EXTRA_NO_PENDING_CHAT_REQUEST", true);
                }
                J(l);
            }
            U = T();
        } else if (intent.getBooleanExtra("EXTRA_REQUEST_TYPE_QUEUE_STATUS_UPDATE", false)) {
            if (this.f == null || this.x) {
                deqh.c(intent);
                U = T();
            } else {
                try {
                    final String stringExtra = intent.getStringExtra("EXTRA_REQUEST_VERSION");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        t(new bipo() { // from class: bits
                            @Override // defpackage.bipo
                            public final void b(bipq bipqVar) {
                                String str4 = stringExtra;
                                ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService2 = ChatRequestAndConversationChimeraService.this;
                                bitk.u(chatRequestAndConversationChimeraService2.f, chatRequestAndConversationChimeraService2.h, Long.valueOf(str4));
                            }
                        });
                    }
                    bitk.C(this, this.f);
                    W();
                    E();
                    deqh.c(intent);
                    U = T();
                } finally {
                }
            }
        } else if (intent.getBooleanExtra("EXTRA_REQUEST_TYPE_CONVERSATION_UPDATE", false)) {
            HelpConfig helpConfig7 = this.f;
            if (helpConfig7 == null) {
                deqh.c(intent);
                U = T();
            } else {
                try {
                    bitk.C(this, helpConfig7);
                    W();
                    Z();
                    deqh.c(intent);
                    U = T();
                } finally {
                }
            }
        } else if (intent.getBooleanExtra("EXTRA_REQUEST_TYPE_UPDATE_AGENT_TYPING_STATUS", false)) {
            HelpConfig helpConfig8 = this.f;
            if (helpConfig8 == null || !this.l) {
                deqh.c(intent);
                U = T();
            } else {
                try {
                    bitk.C(this, helpConfig8);
                    W();
                    J(n("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_AGENT_TYPING_STATUS").putExtra("EXTRA_NEW_TYPING_STATUS", intent.getIntExtra("EXTRA_NEW_TYPING_STATUS", 0)).putExtra("EXTRA_NEW_TYPING_STATUS_PARTICIPANT_ID", intent.getStringExtra("EXTRA_NEW_TYPING_STATUS_PARTICIPANT_ID")).putExtra("EXTRA_NEW_TYPING_STATUS_CLIENT_TIME", intent.getLongExtra("EXTRA_NEW_TYPING_STATUS_CLIENT_TIME", -1L)));
                    deqh.c(intent);
                    U = T();
                } finally {
                }
            }
        } else if (intent.getBooleanExtra("EXTRA_REQUEST_TYPE_UPDATE_USER_TYPING_STATUS", false)) {
            if (!intent.hasExtra("EXTRA_NEW_TYPING_STATUS") || this.f == null) {
                ((ejhf) a.j()).G("Got request to update user's typing status, but at least one of the following occurred: no typing status provided [%d], or no configurations available [%s].", intent.getIntExtra("EXTRA_NEW_TYPING_STATUS", 0), this.f);
            }
            final bjcn bjcnVar = (bjcn) eiid.i(bjcn.b(intent.getIntExtra("EXTRA_NEW_TYPING_STATUS", 0))).e(bjcn.UNKNOWN_TYPING_STATUS);
            t(new bipo() { // from class: biuf
                @Override // defpackage.bipo
                public final void b(bipq bipqVar) {
                    ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService2 = ChatRequestAndConversationChimeraService.this;
                    chatRequestAndConversationChimeraService2.p().execute(new bive(bjcnVar, bipqVar, chatRequestAndConversationChimeraService2, chatRequestAndConversationChimeraService2.f, chatRequestAndConversationChimeraService2.p(), chatRequestAndConversationChimeraService2.g));
                }
            });
            U = T();
        } else if (intent.getBooleanExtra("EXTRA_REQUEST_TYPE_SEND_CHAT_CONVERSATION_MESSAGE", false)) {
            String stringExtra2 = intent.getStringExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_CONTENT");
            if (stringExtra2 == null || (helpConfig = this.f) == null) {
                ((ejhf) a.j()).P("Got request to send a message, but at least one of the following occurred: no message provided [%s] or no configurations available [%s].", stringExtra2, this.f);
                U = U();
            } else if (bjeg.c(helpConfig) && bitk.h(this.f, this.h) == null) {
                ((ejhf) a.j()).x("Got request to send a message, but configurations are missing.");
                U = U();
            } else {
                long longExtra = intent.getLongExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_CLIENT_TIME", 0L);
                if (!intent.hasExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_CLIENT_TIME")) {
                    ((ejhf) a.j()).A("Got request to send a message, but no client time was provided [%d].", longExtra);
                }
                L(stringExtra2, longExtra, intent.getStringExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_SMART_REPLY_PREDICTION_ID"), intent.getStringExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_SMART_REPLY_ACCEPTED_RECOMMENDATION_ID"));
                U = T();
            }
        } else if (intent.getBooleanExtra("EXTRA_REQUEST_TYPE_SEND_CHAT_NOTIFICATION_DIRECT_MESSAGE", false)) {
            Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
            String valueOf = resultsFromIntent != null ? String.valueOf(resultsFromIntent.getCharSequence("textReply")) : null;
            if (valueOf == null || this.f == null) {
                ((ejhf) a.j()).P("Got request to send a message, but at least one of the following occurred: no message provided [%s] or no configurations available [%s].", valueOf, this.f);
                U = U();
            } else {
                long longExtra2 = intent.getLongExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_CLIENT_TIME", 0L);
                if (!intent.hasExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_CLIENT_TIME")) {
                    ((ejhf) a.j()).A("Got request to send a message, but no client time was provided [%d].", longExtra2);
                }
                if (bivk.b(fonz.c())) {
                    if (intent.hasExtra("EXTRA_NOTIFICATION_SMART_REPLY_PREDICTION_ID") && intent.hasExtra("EXTRA_NOTIFICATION_SMART_REPLY_TO_RECOMMENDATION_ID_BUNDLE")) {
                        String stringExtra3 = intent.getStringExtra("EXTRA_NOTIFICATION_SMART_REPLY_PREDICTION_ID");
                        Bundle bundleExtra = intent.getBundleExtra("EXTRA_NOTIFICATION_SMART_REPLY_TO_RECOMMENDATION_ID_BUNDLE");
                        if (TextUtils.isEmpty(stringExtra3) || !bundleExtra.containsKey(valueOf)) {
                            chatRequestAndConversationChimeraService = this;
                            str2 = stringExtra3;
                            str3 = null;
                        } else {
                            chatRequestAndConversationChimeraService = this;
                            str3 = bundleExtra.getString(valueOf);
                            str2 = stringExtra3;
                        }
                        str = valueOf;
                        chatRequestAndConversationChimeraService.L(str, longExtra2, str2, str3);
                        bjaw.p(this, this.f, 8);
                        R(51);
                        if (intent.hasExtra("EXTRA_NOTIFICATION_SMART_REPLY_PREDICTION_ID") || !intent.hasExtra("EXTRA_NOTIFICATION_SMART_REPLY_TO_RECOMMENDATION_ID_BUNDLE")) {
                            ((ejhf) a.i()).x("Expected the smart reply prediction id and recommendation id map in the direct reply intent.");
                        } else {
                            String stringExtra4 = intent.getStringExtra("EXTRA_NOTIFICATION_SMART_REPLY_PREDICTION_ID");
                            Bundle bundleExtra2 = intent.getBundleExtra("EXTRA_NOTIFICATION_SMART_REPLY_TO_RECOMMENDATION_ID_BUNDLE");
                            if (!TextUtils.isEmpty(stringExtra4) && bundleExtra2.containsKey(str)) {
                                bjaw.q(stringExtra4, bundleExtra2.getString(str), 3, this, this.f);
                                bjbk.n(stringExtra4, bundleExtra2.getString(str), 3, 212, this, this.f, this.g);
                            }
                        }
                        U = T();
                    } else {
                        ((ejhf) a.i()).x("Expected the smart reply prediction id and recommendation id map in the direct reply intent.");
                    }
                }
                chatRequestAndConversationChimeraService = this;
                str = valueOf;
                str2 = null;
                str3 = null;
                chatRequestAndConversationChimeraService.L(str, longExtra2, str2, str3);
                bjaw.p(this, this.f, 8);
                R(51);
                if (intent.hasExtra("EXTRA_NOTIFICATION_SMART_REPLY_PREDICTION_ID")) {
                }
                ((ejhf) a.i()).x("Expected the smart reply prediction id and recommendation id map in the direct reply intent.");
                U = T();
            }
        } else if (intent.getBooleanExtra("EXTRA_REQUEST_TYPE_UPDATE_CHAT_CONVERSATION", false)) {
            U = !Z() ? U() : T();
        } else if (intent.getBooleanExtra("EXTRA_REQUEST_TYPE_CANCEL_REQUEST_OR_LEAVE_CONVERSATION", false)) {
            if (this.f == null) {
                ((ejhf) a.j()).x("Got request to leave conversation, but no configurations available.");
                U = U();
            } else {
                this.i = false;
                this.w = true;
                int a2 = a();
                if (a2 != -1) {
                    if (Y(a2)) {
                        p().execute(new bisi(this, this.f, this.g));
                    } else {
                        t(new bipo() { // from class: biuh
                            @Override // defpackage.bipo
                            public final void b(bipq bipqVar) {
                                ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService2 = ChatRequestAndConversationChimeraService.this;
                                if (chatRequestAndConversationChimeraService2.f != null) {
                                    chatRequestAndConversationChimeraService2.p().execute(new bius(bipqVar, chatRequestAndConversationChimeraService2, chatRequestAndConversationChimeraService2.f, chatRequestAndConversationChimeraService2.g));
                                }
                            }
                        });
                    }
                }
                J(l().putExtra("EXTRA_IS_CHAT_REQUEST_CANCELLED", true));
                stopSelf();
                U = T();
            }
        } else if (intent.getBooleanExtra("EXTRA_REQUEST_TYPE_UPDATE_IS_CHAT_IN_FOREGROUND", false)) {
            boolean booleanExtra = intent.getBooleanExtra("EXTRA_IS_CHAT_IN_FOREGROUND", this.j);
            this.j = booleanExtra;
            if (!booleanExtra) {
                t(new bipo() { // from class: bitp
                    @Override // defpackage.bipo
                    public final void b(bipq bipqVar) {
                        ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService2 = ChatRequestAndConversationChimeraService.this;
                        if (bjeg.c(chatRequestAndConversationChimeraService2.f)) {
                            if (intent.getBooleanExtra("EXTRA_STOP_FOREGROUND_SERVICE", false)) {
                                dfee dfeeVar = dfee.GOOGLEHELP_CHAT_STATUS_UPDATE_NOTIFICATION;
                                chatRequestAndConversationChimeraService2.u(4102, dfeeVar);
                                chatRequestAndConversationChimeraService2.u(2014, dfeeVar);
                                chatRequestAndConversationChimeraService2.i = false;
                                chatRequestAndConversationChimeraService2.stopSelf();
                                chatRequestAndConversationChimeraService2.stopForeground(true);
                                return;
                            }
                            return;
                        }
                        List j = bitk.j(bipqVar);
                        if (j.isEmpty()) {
                            return;
                        }
                        bjbu bjbuVar = (bjbu) j.get(j.size() - 1);
                        if (bjbuVar.e == bitk.d(bipqVar) && bjbuVar.c == 6) {
                            chatRequestAndConversationChimeraService2.i = false;
                            chatRequestAndConversationChimeraService2.stopSelf();
                        }
                    }
                });
            } else if (P()) {
                x(4102, dfee.GOOGLEHELP_CHAT_STATUS_UPDATE_NOTIFICATION, i());
                this.m = false;
            }
            U = T();
        } else if (intent.getBooleanExtra("EXTRA_REQUEST_TYPE_NOTIFICATION_DISMISSED", false)) {
            this.i = false;
            stopSelf();
            U = T();
        } else if (intent.getBooleanExtra("EXTRA_REQUEST_TYPE_UPDATE_LAST_SEEN_EVENT_ID", false)) {
            long longExtra3 = intent.getLongExtra("EXTRA_LAST_SEEN_EVENT_ID", -1L);
            synchronized (this) {
                bitk.B(this.h, longExtra3);
            }
            U = T();
        } else if (intent.getBooleanExtra("EXTRA_REQUEST_TYPE_UPDATE_TIMESTAMP_RELATED_OBJECTS", false)) {
            if (this.l) {
                boolean booleanExtra2 = intent.getBooleanExtra("EXTRA_IS_TIME_DIFFERENCE_ESTIMATE_INITIALIZED", false);
                bipq bipqVar = this.h;
                int i4 = bitk.a;
                boolean z = bipqVar != null && bipqVar.m("time_has_changed", false);
                bipq bipqVar2 = this.h;
                boolean z2 = bipqVar2 != null && bipqVar2.m("time_difference_estimate_has_changed", false);
                if (z) {
                    bitk.x(this.h, false);
                }
                if (z2) {
                    bitk.y(this.h, false);
                }
                if (!booleanExtra2 || z) {
                    I();
                } else if (z2) {
                    H(bitk.b(this.h));
                }
                U = T();
            } else {
                U = T();
            }
        } else if (intent.getBooleanExtra("EXTRA_REQUEST_TYPE_CLEAR_SHOULD_NOTIFY_OF_CHAT_REQUEST_ERROR", false)) {
            bitk.q(this, this.f);
            U = T();
        } else if (bivk.b(fonq.c()) && intent.getBooleanExtra("EXTRA_REQUEST_TYPE_REQUEST_CHAT_TRANSCRIPT_EMAIL", false)) {
            t(new bipo() { // from class: bitz
                @Override // defpackage.bipo
                public final void b(bipq bipqVar3) {
                    Intent intent2 = intent;
                    ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService2 = ChatRequestAndConversationChimeraService.this;
                    HelpConfig helpConfig9 = chatRequestAndConversationChimeraService2.f;
                    bjay bjayVar = chatRequestAndConversationChimeraService2.g;
                    String stringExtra5 = intent2.getStringExtra("EXTRA_NOTIFICATION_CHAT_SUPPORT_REQUEST_ID");
                    intent2.getStringExtra("EXTRA_NOTIFICATION_CHAT_POOL_ID");
                    new biuz(chatRequestAndConversationChimeraService2, helpConfig9, bjayVar, stringExtra5, intent2.getStringExtra("EXTRA_NOTIFICATION_CASE_ID")).executeOnExecutor(chatRequestAndConversationChimeraService2.p(), new Void[0]);
                }
            });
            U = T();
        } else {
            U = U();
        }
        if (((Boolean) U.first).booleanValue()) {
            return ((Integer) U.second).intValue();
        }
        if (TextUtils.isEmpty(this.f.N)) {
            throw new IllegalStateException("Attempting to start a ChatRequestAndConversationChimeraService with no support request ID provided.");
        }
        u(2014, dfee.GOOGLEHELP_CHAT_STATUS_UPDATE_NOTIFICATION);
        if (!this.k) {
            this.e = false;
            this.i = true;
            this.w = false;
            this.x = false;
            this.l = false;
            this.o = -1L;
            this.p = -1L;
            this.q = -1L;
            this.A = null;
            this.r = e();
            this.C = null;
            this.t = false;
            bitk.q(this, this.f);
            t(new bipo() { // from class: biua
                @Override // defpackage.bipo
                public final void b(bipq bipqVar3) {
                    ChatRequestAndConversationChimeraService.this.v();
                }
            });
            this.s = new biqq();
            startForeground(4102, j());
            this.k = true;
            t(new bipo() { // from class: biui
                @Override // defpackage.bipo
                public final void b(bipq bipqVar3) {
                    ChatRequestAndConversationChimeraService.this.F(intent.getBooleanExtra("EXTRA_IGNORE_CHAT_QUEUE_STATUS", false));
                }
            });
        }
        return 2;
    }

    public final ensv p() {
        if (this.u == null) {
            this.u = new asmf(Integer.MAX_VALUE, 9);
        }
        return this.u;
    }

    final String r() {
        if (TextUtils.isEmpty(this.y)) {
            CharSequence q = q(getPackageManager(), this.f);
            this.y = q;
            if (TextUtils.isEmpty(q)) {
                return getResources().getString(R.string.gh_chat_google_support);
            }
        }
        return s(R.string.gh_hangout_product_specific_subtext, this.y);
    }

    final String s(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public final synchronized void t(final bipo bipoVar) {
        bipq bipqVar = this.h;
        if (bipqVar != null) {
            bipoVar.b(bipqVar);
            return;
        }
        biqq biqqVar = this.v;
        if (biqqVar != null) {
            biqqVar.addObserver(new Observer() { // from class: biuc
                @Override // java.util.Observer
                public final void update(Observable observable, Object obj) {
                    bipoVar.b(ChatRequestAndConversationChimeraService.this.h);
                }
            });
        }
    }

    public final void u(int i, dfee dfeeVar) {
        if (folt.d()) {
            this.d.m(i, dfeeVar);
        } else {
            this.d.k(i);
        }
    }

    public final void v() {
        arwm.s(this.f);
        arwm.s(this.h);
        bitk.l(this, this.f, this.h);
    }

    final void w() {
        if (this.j) {
            I();
        } else if (foor.a.a().b()) {
            t(new bipo() { // from class: biug
                @Override // defpackage.bipo
                public final void b(bipq bipqVar) {
                    bitk.x(ChatRequestAndConversationChimeraService.this.h, true);
                }
            });
        } else {
            bitk.x(this.h, true);
        }
    }

    public final void x(int i, dfee dfeeVar, Notification notification) {
        if (folt.d()) {
            this.d.u(i, dfeeVar, notification);
        } else {
            this.d.s(i, notification);
        }
    }

    @Override // defpackage.biun
    public final void y() {
        if (this.f == null) {
            return;
        }
        if (this.l) {
            J(m());
        }
        HelpConfig helpConfig = this.f;
        if (helpConfig == null) {
            ((ejhf) a.j()).x("Got request to join conversation, but no configurations available.");
        } else if (bjeg.c(helpConfig) && TextUtils.isEmpty(this.f.N)) {
            ((ejhf) a.j()).x("Got request to join conversation, but configurations are missing.");
        } else if (!this.x) {
            this.x = true;
            bjaw.p(this, this.f, 7);
            R(49);
            t(new bipo() { // from class: bitw
                @Override // defpackage.bipo
                public final void b(bipq bipqVar) {
                    ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = ChatRequestAndConversationChimeraService.this;
                    arwm.s(chatRequestAndConversationChimeraService.f);
                    new biur(bipqVar, chatRequestAndConversationChimeraService, chatRequestAndConversationChimeraService.f, chatRequestAndConversationChimeraService.g).executeOnExecutor(chatRequestAndConversationChimeraService.p(), new Void[0]);
                }
            });
        }
        HelpConfig helpConfig2 = this.f;
        if (helpConfig2 == null || !bitk.E(this, helpConfig2)) {
            t(new bipo() { // from class: bitq
                @Override // defpackage.bipo
                public final void b(bipq bipqVar) {
                    ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = ChatRequestAndConversationChimeraService.this;
                    if (chatRequestAndConversationChimeraService.n == null) {
                        chatRequestAndConversationChimeraService.n = new biuk(chatRequestAndConversationChimeraService.f, chatRequestAndConversationChimeraService);
                    }
                    chatRequestAndConversationChimeraService.n.run();
                }
            });
        }
    }

    @Override // defpackage.biun
    public final void z() {
        Intent putExtra;
        this.i = false;
        bipq bipqVar = this.h;
        if (bipqVar == null || !bitk.F(bipqVar)) {
            x(2014, dfee.GOOGLEHELP_CHAT_STATUS_UPDATE_NOTIFICATION, g());
            putExtra = l().putExtra("EXTRA_IS_CHAT_DATA_STALE", true);
        } else {
            putExtra = l().putExtra("EXTRA_WAS_CHAT_SUPPORT_ENDED", true);
        }
        J(putExtra);
        stopSelf();
    }
}
