package com.google.android.gms.mobiledataplan.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import com.google.android.gms.chimera.modules.mobiledataplan.AppContextProvider;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;
import com.google.android.gms.mobiledataplan.PurchasePlanActivation;
import com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsChimeraActivity;
import defpackage.Cenum;
import defpackage.aszs;
import defpackage.aszt;
import defpackage.atad;
import defpackage.auid;
import defpackage.aupz;
import defpackage.ausn;
import defpackage.bcld;
import defpackage.bcnd;
import defpackage.bp;
import defpackage.bzna;
import defpackage.cbny;
import defpackage.cgkb;
import defpackage.cgkf;
import defpackage.cgls;
import defpackage.cglz;
import defpackage.cgnh;
import defpackage.cgoy;
import defpackage.cgqg;
import defpackage.cgrn;
import defpackage.cgro;
import defpackage.cgsl;
import defpackage.cgso;
import defpackage.cgsq;
import defpackage.cgtj;
import defpackage.cgtk;
import defpackage.cgtm;
import defpackage.cguq;
import defpackage.cgzm;
import defpackage.cgzp;
import defpackage.eluo;
import defpackage.enul;
import defpackage.ewko;
import defpackage.fgrc;
import defpackage.fhvs;
import defpackage.fszq;
import defpackage.ftaf;
import defpackage.ftaq;
import defpackage.ftat;
import defpackage.ftax;
import defpackage.ftbn;
import defpackage.ftbz;
import defpackage.ftch;
import defpackage.ig;
import defpackage.rxx;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MobileDataPlanSettingsChimeraActivity extends rxx {
    public static final ausn j = ausn.b("MobileDataPlan", auid.MOBILE_DATA_PLAN);
    private static boolean n = false;
    public float k;
    public cgro l;
    public boolean m;
    private boolean o = false;
    private final int p = R.layout.settings_activity;
    private cgtk q = null;
    private boolean r = false;

    public static ewko a(Context context) {
        fgrc v = ewko.a.v();
        String e = cgzp.e(context.getApplicationContext());
        if (!v.b.L()) {
            v.U();
        }
        ewko ewkoVar = (ewko) v.b;
        e.getClass();
        ewkoVar.c = e;
        String string = context.getString(R.string.support_page_error_message);
        if (!v.b.L()) {
            v.U();
        }
        ewko ewkoVar2 = (ewko) v.b;
        string.getClass();
        ewkoVar2.b = string;
        return (ewko) v.Q();
    }

    private final void t(Intent intent) {
        Optional empty;
        if (ftbz.j()) {
            if (intent == null) {
                empty = Optional.empty();
            } else if (intent.getExtras() == null) {
                ((eluo) j.i()).x("Expected intent extras field is null.");
                empty = Optional.empty();
            } else if (intent.getExtras().containsKey("NOTIFICATION_LOGGING_CAMPAIGN_ID")) {
                String string = intent.getExtras().getString("NOTIFICATION_LOGGING_CAMPAIGN_ID");
                empty = TextUtils.isEmpty(string) ? Optional.empty() : Optional.of(string);
            } else {
                empty = Optional.empty();
            }
            if (empty.isPresent()) {
                j.f(cgzp.h()).B("ChimeraActivity sets campaignId: %s", empty.get());
                this.l.r((String) empty.get());
            }
        }
    }

    private static final boolean u(ewko ewkoVar) {
        if (ewkoVar != null) {
            return (ewkoVar.b.isEmpty() && ewkoVar.d.size() == 0) ? false : true;
        }
        return false;
    }

    public final void k(fhvs fhvsVar, Bundle bundle, String str) {
        cgqg.z(this, bundle, R.id.carrier_support_page_placeholder, fhvsVar, str);
        findViewById(R.id.content_layout).setVisibility(8);
    }

    public final void l() {
        cgls.c().Q(26, this.q.toString(), "R.id.error_layout", fhvs.ERROR_PAGE_HIDDEN, System.currentTimeMillis(), cgtm.a());
        findViewById(R.id.error_screen_flipper).setVisibility(8);
        findViewById(R.id.content_layout).setVisibility(0);
    }

    public final void m() {
        findViewById(R.id.user_notice_card).setVisibility(8);
    }

    final void n(boolean z, boolean z2) {
        fhvs fhvsVar;
        cgls c = cgls.c();
        Intent intent = getIntent();
        String action = intent == null ? null : intent.getAction();
        if (!z && !z2) {
            if (ftat.e() && this.m) {
                return;
            }
            c.Q(40, null, null, fhvs.REENTER_MDP_UI_VIA_APP_PICKER, System.currentTimeMillis(), cgtm.a());
            return;
        }
        if (action != null) {
            if (action.equals("com.google.android.gms.mobiledataplan.NOTIFICATION_TO_ACTIVITY")) {
                int b = Cenum.b(intent.getIntExtra("NOTIFICATION_LOGGING_NOTIFICATION_TYPE", 0));
                if (b == 0) {
                    throw null;
                }
                int i = b - 2;
                if (i != 100) {
                    switch (i) {
                        case 1:
                            fhvsVar = fhvs.PLAN_STATUS_JUMP_TO_UI;
                            break;
                        case 2:
                            fhvsVar = fhvs.UPSELL_OFFER_JUMP_TO_UI;
                            break;
                        case 3:
                            if (!ftbn.f()) {
                                fhvsVar = fhvs.WELCOME_JUMP_TO_UI;
                                break;
                            } else {
                                fhvsVar = fhvs.ACCOUNT_ALERT_JUMP_TO_UI;
                                break;
                            }
                        case 4:
                            fhvsVar = fhvs.OUT_OF_DATA_JUMP_TO_UI;
                            break;
                        case 5:
                            fhvsVar = fhvs.EXPIRATION_REMINDER_JUMP_TO_UI;
                            break;
                        case 6:
                            fhvsVar = fhvs.ACCOUNT_BALANCE_JUMP_TO_UI;
                            break;
                        case 7:
                            fhvsVar = fhvs.PURCHASE_JUMP_TO_UI;
                            break;
                        case 8:
                            fhvsVar = fhvs.WELCOME_JUMP_TO_UI;
                            break;
                        case 9:
                            fhvsVar = fhvs.DAILY_UPDATE_JUMP_TO_UI;
                            break;
                        case 10:
                            fhvsVar = fhvs.PAYGO_JUMP_TO_UI;
                            break;
                        default:
                            fhvsVar = fhvs.UNSPECIFIED_EVENT_CODE;
                            break;
                    }
                } else {
                    fhvsVar = fhvs.OTHER_JUMP_TO_UI;
                }
                if (z) {
                    if (intent.getIntExtra("NOTIFICATION_ACTION_INDEX", -1) != -1) {
                        c.z(intent, enul.NOTIFICATION_ACTION_TAKEN, "MDP_UiAction", fhvs.NOTIFICATION_ACTION_TAKEN);
                    }
                    c.z(intent, enul.JUMP_TO_UI, "MDP_UiAction", fhvsVar);
                }
                long longExtra = intent.getLongExtra("NOTIFICATION_LOGGING_NOTIFICATION_ID", 0L);
                c.P(true != z ? 41 : 17, Long.toString(longExtra), Long.toString(longExtra), Long.valueOf(longExtra), z ? fhvs.ENTER_MDP_UI_VIA_NOTIFICATION : fhvs.REENTER_MDP_UI_VIA_NOTIFICATION, System.currentTimeMillis(), cgtm.a());
                return;
            }
            if (action.equals("com.google.android.gms.mobiledataplan.ui.SETTING_TO_ACTIVITY")) {
                c.Q(16, null, null, fhvs.ENTER_MDP_UI_VIA_MENU, System.currentTimeMillis(), cgtm.a());
                return;
            } else if (action.equals("com.google.android.gms.mobiledataplan.ui.DETAIL_SETTINGS_TO_MAIN")) {
                c.Q(73, null, null, fhvs.ENTER_MDP_UI_VIA_SETTINGS, System.currentTimeMillis(), cgtm.a());
            }
        }
        Uri referrer = getReferrer();
        c.Q(true != z ? 42 : 18, referrer != null ? referrer.toString() : "Unknown Calling Package", null, z ? fhvs.ENTER_MDP_UI_VIA_DEEP_LINK : fhvs.REENTER_MDP_UI_VIA_DEEP_LINK, System.currentTimeMillis(), cgtm.a());
    }

    public final void o(cgtk cgtkVar) {
        Button button;
        TextView textView;
        TextView textView2;
        ImageView imageView;
        ImageView imageView2;
        byte[] asByteArray;
        invalidateOptionsMenu();
        ViewFlipper viewFlipper = (ViewFlipper) findViewById(R.id.error_screen_flipper);
        if (getResources().getConfiguration().orientation == 2) {
            viewFlipper.setDisplayedChild(1);
        } else {
            viewFlipper.setDisplayedChild(0);
        }
        if (findViewById(R.id.support_channel_page_layout) != null) {
            onBackPressed();
        }
        findViewById(R.id.content_layout).setVisibility(8);
        this.q = cgtkVar;
        viewFlipper.setVisibility(0);
        this.l.t(false);
        cguq.a();
        if (getResources().getConfiguration().orientation == 2) {
            button = (Button) findViewById(R.id.refresh_button_landscape);
            textView = (TextView) findViewById(R.id.error_title_landscape);
            textView2 = (TextView) findViewById(R.id.error_description_landscape);
            imageView = (ImageView) findViewById(R.id.error_picture_landscape);
            imageView2 = (ImageView) findViewById(R.id.carrier_logo_landscape);
        } else {
            button = (Button) findViewById(R.id.refresh_button_portrait);
            textView = (TextView) findViewById(R.id.error_title_portrait);
            textView2 = (TextView) findViewById(R.id.error_description_portrait);
            imageView = (ImageView) findViewById(R.id.error_picture_portrait);
            imageView2 = (ImageView) findViewById(R.id.carrier_logo_portrait);
        }
        ImageView imageView3 = imageView2;
        ImageView imageView4 = imageView;
        TextView textView3 = textView2;
        TextView textView4 = textView;
        Button button2 = button;
        final String g = this.l.g();
        textView4.setText(getString(cgtkVar.g, new Object[]{g}));
        if (ftbz.m() && cgtkVar == cgtk.UNSUPPORTED && g != null && Build.VERSION.SDK_INT >= 29) {
            try {
                if (Duration.ofMillis(System.currentTimeMillis()).toSeconds() >= bzna.a(AppContextProvider.a(), "mobiledataplan", "ESIM_SHARED_PREFS", 0).b("ESIM_LAST_SUCCESS_TIMESTAMP", 0L) + 86400) {
                    ((eluo) j.h()).B("Pending valid data plan response for eSIM subscriber of carrier: %s", g);
                } else {
                    boolean anyMatch = Collection.EL.stream(SubscriptionManager.from(this).getActiveSubscriptionInfoList()).anyMatch(new Predicate() { // from class: cgsk
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo478negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        @Override // java.util.function.Predicate
                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            boolean isEmbedded;
                            SubscriptionInfo subscriptionInfo = (SubscriptionInfo) obj;
                            ausn ausnVar = MobileDataPlanSettingsChimeraActivity.j;
                            isEmbedded = subscriptionInfo.isEmbedded();
                            if (isEmbedded) {
                                return Objects.equals(subscriptionInfo.getCarrierName().toString(), g);
                            }
                            return false;
                        }
                    });
                    ausn ausnVar = j;
                    ((eluo) ausnVar.h()).Q("eSIM subscriber of valid carrier %s: %s", g, anyMatch);
                    if (anyMatch) {
                        ((eluo) ausnVar.j()).B("Unsupported plan error with eSIM carrier: %s", g);
                        textView4.setText(getString(R.string.esim_post_activation_message, new Object[]{g}));
                        imageView4.setImageResource(R.drawable.check_circle);
                    }
                }
            } catch (IOException e) {
                ((eluo) ((eluo) j.j()).s(e)).x("KeyValuePreferences failed to fetch eSIM status.");
            }
        }
        if (cgtkVar != cgtk.OPTED_OUT) {
            int i = cgtkVar.h;
            if (i == 0) {
                textView3.setVisibility(8);
            } else {
                textView3.setVisibility(0);
                if (TextUtils.isEmpty(g) && ftch.a.lK().d()) {
                    textView3.setText(cgtkVar.k);
                } else {
                    textView3.setText(getString(i, new Object[]{g}));
                }
            }
            imageView4.setVisibility(true != cgtkVar.l ? 8 : 0);
            imageView3.setVisibility(8);
            int i2 = cgtkVar.i;
            if (i2 == 0) {
                button2.setVisibility(8);
            } else {
                button2.setVisibility(0);
                button2.setText(i2);
                button2.setOnClickListener(new cgrn(this.l));
            }
            m();
            cgls.c().Q(43, "handledError", null, fhvs.FINISH_UI_AFTER_USER_TRIGGER, System.currentTimeMillis(), cgtm.a());
            return;
        }
        if (ftbz.v()) {
            textView4.setText(getString(R.string.t_mobile_opted_out_title));
            Object g2 = ftaf.g();
            Object h = ftaf.h();
            Object f = ftaf.f();
            ftaf ftafVar = ftaf.a;
            textView3.setText(Html.fromHtml(getString(R.string.t_mobile_opted_out_text, new Object[]{g, g2, h, f, ftafVar.lK().h(), ftafVar.lK().g()})));
        } else {
            textView3.setText(Html.fromHtml(getString(cgtkVar.h, new Object[]{g, ftaf.g(), ftaf.h(), ftaf.f()})));
        }
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
        button2.setVisibility(0);
        button2.setText(cgtkVar.i);
        button2.setOnClickListener(new cgsq(this.l));
        cgkb c = cgkb.c();
        MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse = this.l.q;
        Bitmap bitmap = null;
        Long valueOf = mdpCarrierPlanIdResponse != null ? Long.valueOf(mdpCarrierPlanIdResponse.e) : null;
        if (valueOf == null) {
            valueOf = cgkb.c().p(cgzm.g(AppContextProvider.a()));
        }
        cgkf a = c.d.a(valueOf);
        if (a != null && (asByteArray = a.a.getAsByteArray("carrier_logo")) != null) {
            bitmap = BitmapFactory.decodeByteArray(asByteArray, 0, asByteArray.length);
        }
        if (bitmap != null) {
            imageView3.setImageBitmap(bitmap);
            imageView3.setVisibility(0);
        } else {
            imageView3.setVisibility(8);
        }
        imageView4.setVisibility(8);
        cgls.c().Q(69, null, "R.id.error_layout", fhvs.OPT_OUT_PAGE_SHOWN, System.currentTimeMillis(), cgtm.a());
        cgls.c().Q(43, "handledError", null, fhvs.FINISH_UI_AFTER_USER_TRIGGER, System.currentTimeMillis(), cgtm.a());
    }

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 2333) {
            if (i != 2334 || i2 == -1) {
                return;
            }
            this.l.q(true);
            return;
        }
        if (i2 == -1) {
            cgtj.c(this.l, true);
        } else {
            cgtj.c(this.l, false);
            p(new aszt(new Status(27023)));
        }
    }

    @Override // defpackage.rxx, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onConfigurationChanged(Configuration configuration) {
        boolean isInMultiWindowMode;
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT > 24 && !r()) {
            isInMultiWindowMode = getContainerActivity().isInMultiWindowMode();
            if (isInMultiWindowMode) {
                if (ftch.a.lK().h()) {
                    recreate();
                    return;
                } else {
                    finish();
                    startActivity(getIntent());
                    return;
                }
            }
        }
        if (r()) {
            o(this.q);
        }
        cgro cgroVar = this.l;
        if (cgroVar.f == null) {
            return;
        }
        cgroVar.m.o();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        cgro cgroVar;
        Activity containerActivity;
        super.onCreate(bundle);
        setTitle(R.string.mobile_data_plan);
        setContentView(this.p);
        ig hO = hO();
        hO.q(4, 4);
        hO.o(true);
        if (Build.VERSION.SDK_INT > 25) {
            if (ftch.j()) {
                hO.j(new ColorDrawable(getResources().getColor(R.color.carrier_header_background)));
            } else {
                hO.j(new ColorDrawable(getResources().getColor(R.color.top_entry_grey)));
            }
        }
        this.k = hO.a();
        hO.t(0.0f);
        if (ftbz.m() && !this.r) {
            setTheme(R.style.Theme_MobileDataPlan_DefaultGoogleMaterial);
            boolean q = q(getIntent());
            this.r = !q;
            if (!q) {
                return;
            }
        }
        if (!ftax.Q()) {
            ((eluo) j.j()).x("Mobiledataplan's Settings is not enabled in this device yet.");
            finish();
            return;
        }
        if (cgzp.i(this)) {
            finish();
            return;
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.dataplan_recyclerview);
        recyclerView.aj(new LinearLayoutManager());
        recyclerView.z(new cgso(this, hO));
        this.m = false;
        n = false;
        if (ftch.g()) {
            try {
                cgro.d();
                ((eluo) j.h()).x("GlobalStateHelper was NOT null, calling destroyInstance() first to create new GlobalStateHelper.");
                cgro.l();
            } catch (IllegalStateException unused) {
            }
        }
        cgtm.b();
        synchronized (cgro.c) {
            cgro cgroVar2 = cgro.d;
            if (cgroVar2 != null) {
                throw new IllegalStateException("createInstance called when instance != null! Instance: " + cgroVar2.toString());
            }
            cgro.d = new cgro(this);
            cgroVar = cgro.d;
        }
        this.l = cgroVar;
        t(getIntent());
        n(true, this.o);
        if (ftbz.w()) {
            s(getIntent());
        }
        ftaq ftaqVar = ftaq.a;
        if (!ftaqVar.lK().b() || (containerActivity = getContainerActivity()) == null) {
            return;
        }
        cbny.a(containerActivity, auid.MOBILE_DATA_PLAN, ftaqVar.lK().a(), ftaqVar.lK().c());
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onCreateOptionsMenu(Menu menu) {
        if (findViewById(R.id.support_channel_page_layout) != null) {
            return false;
        }
        getMenuInflater().inflate(R.menu.mobiledataplan_settings_menu, menu);
        return true;
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        if (this.l != null && (!ftch.g() || this.l == cgro.d())) {
            cgls.c().Q(37, null, null, fhvs.TERMINATE_MDP_UI, System.currentTimeMillis(), cgtm.a());
            cgro.l();
            cgtm.a = null;
        }
        fszq.a.lK().k();
        super.onDestroy();
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.o = true;
        setIntent(intent);
        if (ftbz.m()) {
            boolean q = q(intent);
            this.r = !q;
            if (!q) {
                return;
            }
        }
        if (ftbz.w()) {
            s(intent);
        }
        t(intent);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        }
        Bitmap bitmap = null;
        if (itemId == R.id.feedback) {
            aszs aszsVar = bcld.a;
            atad atadVar = new atad((Context) this, (int[][]) null);
            try {
                View rootView = getWindow().getDecorView().getRootView();
                Bitmap createBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.RGB_565);
                rootView.draw(new Canvas(createBitmap));
                bitmap = createBitmap;
            } catch (IllegalArgumentException e) {
                ((eluo) ((eluo) j.j()).s(e)).x("MobileDataPlan feedback got screenshot failed!");
            }
            bcnd bcndVar = new bcnd(this);
            bcndVar.a = bitmap;
            bcndVar.e = "com.google.android.gms.mobiledataplan.USER_INITIATED_FEEDBACK_REPORT";
            MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse = this.l.q;
            if (mdpCarrierPlanIdResponse == null) {
                atadVar.aa(bcndVar.a());
            } else {
                bcndVar.c("carrier ID", Long.toString(mdpCarrierPlanIdResponse.e));
                String str = mdpCarrierPlanIdResponse.a;
                if (!TextUtils.isEmpty(str)) {
                    bcndVar.c("CPID", str);
                }
                atadVar.aa(bcndVar.a());
            }
            return true;
        }
        if (itemId == R.id.refresh) {
            cgls.c().Q(13, "refresh_button", "R.id.refresh", fhvs.REFRESH_DATA_PLAN, System.currentTimeMillis(), cgtm.a());
            this.l.q(false);
            return true;
        }
        if (itemId == R.id.stop_syncing) {
            new AlertDialog.Builder(this).setTitle(R.string.stop_syncing_confirm_dialog_title).setMessage(getString(R.string.stop_syncing_confirm_dialog_message, new Object[]{this.l.g()})).setPositiveButton(R.string.stop_syncing_confirm_dialog_positive_button, new DialogInterface.OnClickListener() { // from class: cgsj
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    cgls.c().Q(31, null, null, fhvs.CLICK_STOP_SYNCING_PLAN, System.currentTimeMillis(), cgtm.a());
                    MobileDataPlanSettingsChimeraActivity mobileDataPlanSettingsChimeraActivity = MobileDataPlanSettingsChimeraActivity.this;
                    if (ftax.C()) {
                        cgtj.c(mobileDataPlanSettingsChimeraActivity.l, false);
                    }
                    mobileDataPlanSettingsChimeraActivity.p(new aszt(new Status(27023)));
                }
            }).setNegativeButton(R.string.common_cancel, (DialogInterface.OnClickListener) null).create().show();
            return true;
        }
        if (itemId != R.id.support) {
            if (itemId != R.id.settings) {
                return super.onOptionsItemSelected(menuItem);
            }
            Intent className = new Intent("com.google.android.gms.mobiledataplan.ui.SETTINGS").setClassName(this, "com.google.android.gms.mobiledataplan.ui.MobileDataPlanDetailActivity");
            if (ftat.e() && cgtm.a() != null) {
                className.putExtra("EventFlowId", cgtm.a());
            }
            className.putExtra("ComeFrom", "com.google.android.gms/com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsActivity");
            startActivityForResult(className, 2334);
            return true;
        }
        cgls.c().Q(33, menuItem.getTitle().toString(), "R.id.support", fhvs.CLICK_CARRIER_SUPPORT, System.currentTimeMillis(), cgtm.a());
        ewko e2 = cgkb.c().e(cgzm.g(getApplicationContext()));
        if (!u(e2)) {
            ((eluo) j.j()).x("Trying to launch support page when there is no support object!");
            e2 = a(this);
        }
        bp bpVar = new bp(getSupportFragmentManager());
        cgoy cgoyVar = new cgoy();
        cgoyVar.a = e2;
        bpVar.F(R.id.carrier_support_page_placeholder, cgoyVar);
        bpVar.j = FragmentTransaction.TRANSIT_FRAGMENT_FADE;
        bpVar.w(null);
        bpVar.a();
        getSupportFragmentManager().an();
        findViewById(R.id.content_layout).setVisibility(8);
        setTitle(getString(R.string.support_menu_item, new Object[]{this.l.g()}));
        invalidateOptionsMenu();
        return true;
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onPause() {
        super.onPause();
        if (this.r) {
            j.f(cgzp.h()).x("Skipping onPause after eSIM started.");
            return;
        }
        if (!ftat.e() || !this.m) {
            cgls.c().Q(15, null, null, fhvs.EXIT_MDP_UI, System.currentTimeMillis(), cgtm.a());
        }
        this.l.B = false;
        if (this.m) {
            return;
        }
        n = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00af, code lost:
    
        if (r5 == defpackage.fhvq.OPT_IN) goto L37;
     */
    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onPrepareOptionsMenu(android.view.Menu r9) {
        /*
            r8 = this;
            boolean r0 = r8.r
            r1 = 0
            if (r0 == 0) goto L15
            ausn r9 = com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsChimeraActivity.j
            java.util.logging.Level r0 = defpackage.cgzp.h()
            eluo r9 = r9.f(r0)
            java.lang.String r0 = "Skipping onPrepareOptionsMenu after eSIM started."
            r9.x(r0)
            return r1
        L15:
            android.content.Context r0 = r8.getApplicationContext()
            java.lang.String r0 = defpackage.cgzm.g(r0)
            r8.r()
            cgkb r2 = defpackage.cgkb.c()
            r2.F(r0)
            defpackage.fszt.g()
            cgkb r2 = defpackage.cgkb.c()
            r2.e(r0)
            cgro r2 = r8.l
            r2.g()
            r2 = r1
        L37:
            int r3 = r9.size()
            r4 = 1
            if (r2 >= r3) goto Lf1
            android.view.MenuItem r3 = r9.getItem(r2)
            java.lang.CharSequence r5 = r3.getTitle()
            r6 = 2132091651(0x7f152303, float:1.9823676E38)
            java.lang.String r6 = r8.getString(r6)
            if (r5 != r6) goto L72
            boolean r5 = r8.r()
            if (r5 != 0) goto L6c
            cgkb r5 = defpackage.cgkb.c()
            boolean r5 = r5.F(r0)
            if (r5 == 0) goto L6c
            boolean r5 = defpackage.ftax.C()
            if (r5 == 0) goto L6c
            boolean r5 = defpackage.cgkb.u()
            if (r5 != 0) goto L6c
            goto L6d
        L6c:
            r4 = r1
        L6d:
            r3.setVisible(r4)
            goto Led
        L72:
            java.lang.CharSequence r5 = r3.getTitle()
            r6 = 2132091755(0x7f15236b, float:1.9823887E38)
            java.lang.String r7 = r8.getString(r6)
            if (r5 != r7) goto Led
            boolean r5 = r8.r()
            if (r5 != 0) goto Lea
            cgkb r5 = defpackage.cgkb.c()
            boolean r5 = r5.F(r0)
            if (r5 != 0) goto Lb1
            cgkb r5 = defpackage.cgkb.c()
            boolean r7 = defpackage.cgkb.u()
            if (r7 == 0) goto Lea
            fgvv r7 = r5.l()
            if (r7 == 0) goto Lea
            fgvv r5 = r5.l()
            int r5 = r5.g
            fhvq r5 = defpackage.fhvq.b(r5)
            if (r5 != 0) goto Lad
            fhvq r5 = defpackage.fhvq.UNRECOGNIZED
        Lad:
            fhvq r7 = defpackage.fhvq.OPT_IN
            if (r5 != r7) goto Lea
        Lb1:
            boolean r5 = defpackage.fszt.g()
            if (r5 == 0) goto Lea
            cgkb r5 = defpackage.cgkb.c()
            ewko r5 = r5.e(r0)
            boolean r5 = u(r5)
            if (r5 == 0) goto Lea
            cgro r5 = r8.l
            java.lang.String r5 = r5.g()
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto Lea
            r3.setVisible(r4)
            java.lang.String r5 = r8.getString(r6)
            cgro r6 = r8.l
            java.lang.String r6 = r6.g()
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r6
            java.lang.String r4 = java.lang.String.format(r5, r4)
            r3.setTitle(r4)
            goto Led
        Lea:
            r3.setVisible(r1)
        Led:
            int r2 = r2 + 1
            goto L37
        Lf1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsChimeraActivity.onPrepareOptionsMenu(android.view.Menu):boolean");
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onRestart() {
        super.onRestart();
        if (this.r) {
            j.f(cgzp.h()).x("Recreating activity in onRestart after eSIM started.");
            recreate();
            return;
        }
        if (n && ftat.l()) {
            cgtm.b();
            n = false;
        }
        n(false, this.o);
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        if (this.r) {
            j.f(cgzp.h()).x("Skipping onResume after eSIM started.");
            return;
        }
        if (n && ftat.l()) {
            cgtm.b();
            n = false;
        }
        this.l.B = true;
        this.o = false;
        new cglz().m();
        if (!this.m && !r()) {
            this.l.q(findViewById(R.id.progress_loader).getVisibility() == 0);
        }
        this.m = false;
    }

    public final void p(Exception exc) {
        cgls.c().Q(14, null, null, fhvs.REFRESH_FAILED, System.currentTimeMillis(), cgtm.a());
        cgtk a = cgtk.a(exc);
        ((eluo) j.f(cgzp.h()).s(exc)).B("Showing error page for error message %s", a);
        cgls.c().Q(25, a.toString(), "R.id.error_layout", fhvs.ERROR_PAGE_SHOWN, System.currentTimeMillis(), cgtm.a());
        o(a);
    }

    final boolean q(Intent intent) {
        if (intent == null) {
            return true;
        }
        String action = intent.getAction();
        if (!Objects.equals(action, "android.intent.action.VIEW")) {
            return true;
        }
        Uri data = intent.getData();
        ausn ausnVar = j;
        ((eluo) ausnVar.h()).B("uri %s", action);
        if (data == null) {
            ((eluo) ausnVar.j()).x("No URI passed in through deeplink intent");
            return true;
        }
        List<String> pathSegments = data.getPathSegments();
        if (pathSegments.size() != 2) {
            ((eluo) ausnVar.h()).B("eSIM single path segment: %s", pathSegments.get(0));
            return true;
        }
        String str = pathSegments.get(0);
        ((eluo) ausnVar.h()).B("eSIM subpath segment : %s", str);
        if (!str.equals("esim")) {
            return true;
        }
        try {
            long parseLong = Long.parseLong(pathSegments.get(1));
            Long valueOf = Long.valueOf(parseLong);
            ftbz ftbzVar = ftbz.a;
            if (!ftbzVar.lK().b().b.contains(valueOf)) {
                throw new IllegalArgumentException("Invalid carrier id passed into eSIM flow");
            }
            ((eluo) ausnVar.h()).B("eSIM flow launched with carrier: %d", valueOf);
            valueOf.getClass();
            Optional ofNullable = Optional.ofNullable(data.getQuery());
            String uuid = UUID.randomUUID().toString();
            Intent addFlags = new Intent("com.google.android.gms.mobiledataplan.ui.ESIM").setClassName(this, "com.google.android.gms.mobiledataplan.ui.MobileDataPlanDetailActivity").addFlags(536870912);
            addFlags.putExtra("ComeFrom", "com.google.android.gms/com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsActivity");
            addFlags.putExtra("esim_carrier_id", parseLong);
            Optional empty = Optional.empty();
            Optional empty2 = Optional.empty();
            if (ofNullable.isPresent()) {
                String str2 = (String) ofNullable.get();
                UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
                urlQuerySanitizer.registerParameters((String[]) Collection.EL.stream(ftbzVar.lK().c().b).toArray(new IntFunction() { // from class: cgsn
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i) {
                        ausn ausnVar2 = MobileDataPlanSettingsChimeraActivity.j;
                        return new String[i];
                    }
                }), UrlQuerySanitizer.getUrlLegal());
                urlQuerySanitizer.setPreferFirstRepeatedParameter(true);
                urlQuerySanitizer.parseQuery(str2);
                Bundle bundle = new Bundle();
                for (UrlQuerySanitizer.ParameterValuePair parameterValuePair : urlQuerySanitizer.getParameterList()) {
                    if (!bundle.containsKey(parameterValuePair.mParameter)) {
                        bundle.putString(parameterValuePair.mParameter, parameterValuePair.mValue);
                    }
                }
                addFlags.putExtra("esim_entry_tags", bundle);
                if (ftbz.r()) {
                    empty = Optional.ofNullable(bundle.getString("plan_segment_id"));
                    empty2 = Optional.ofNullable(bundle.getString("plan_subsegment_id"));
                }
            }
            Optional optional = empty;
            Optional optional2 = empty2;
            cgls.c().r(fhvs.ESIM_FLOW_STARTED, uuid, optional, optional2, parseLong);
            if (Build.VERSION.SDK_INT >= 29 && ftbz.m()) {
                Long valueOf2 = Long.valueOf(parseLong);
                if (uuid == null) {
                    throw new IllegalArgumentException("Gcore eSIM Registration arguments are not set properly");
                }
                valueOf2.getClass();
                final cgnh cgnhVar = new cgnh(this, parseLong, uuid);
                cgls.c().q(fhvs.ESIM_CPID_REGISTER_REQUEST, uuid, optional, optional2, parseLong, 0L);
                final cgsl cgslVar = new cgsl(this, uuid, optional, optional2, parseLong, addFlags);
                new aupz(1, 9).execute(new Runnable() { // from class: cgng
                    @Override // java.lang.Runnable
                    public final void run() {
                        final cgou cgosVar;
                        ausn ausnVar2 = cgnh.a;
                        eluo f = ausnVar2.f(cgzp.h());
                        cgnh cgnhVar2 = cgnh.this;
                        long j2 = cgnhVar2.d;
                        Long valueOf3 = Long.valueOf(j2);
                        Boolean valueOf4 = Boolean.valueOf(ftax.G());
                        String str3 = cgnhVar2.e;
                        f.T("Exec GcoreEsimRegister. req: <%s, %s> gcm:%b", valueOf3, str3, valueOf4);
                        if (ftbz.m()) {
                            Context context = cgnhVar2.b;
                            String c = cgli.a().c(context);
                            ((eluo) ausnVar2.h()).B("eSIM started with GCM token: %s", c);
                            if (TextUtils.isEmpty(c)) {
                                ((eluo) ausnVar2.j()).x("Unable to get a GCM token for eSIM.");
                                new IllegalStateException("Unable to get a GCM token.");
                                cgosVar = new cgos();
                            } else {
                                cgmi cgmiVar = new cgmi(context, ftax.u(), cgnhVar2.c, (int) ftax.f());
                                try {
                                    ewlh e = ftbk.f() ? cgmiVar.e(c, j2, str3, cadl.b) : cgmiVar.e(c, j2, str3, null);
                                    if (e == null) {
                                        ((eluo) ausnVar2.j()).x("Got null response when attempting GcoreEsimRegister");
                                        new IllegalStateException("Got null response.");
                                        cgosVar = new cgos();
                                    } else {
                                        cgosVar = new cgot(e);
                                    }
                                } catch (fwuc e2) {
                                    ((eluo) cgnh.a.f(cgzp.h()).s(e2)).B("GCoreEsimRegister attempt got StatusException: %s", new etrz(etry.NO_USER_DATA, cgmb.a(e2).j));
                                    cgosVar = new cgos(cgmb.a(e2).i);
                                } catch (IllegalArgumentException e3) {
                                    ((eluo) cgnh.a.f(cgzp.h()).s(e3)).B("GCoreEsimRegister attempt with invalid parameter(s): %s", new etrz(etry.NO_USER_DATA, e3.getMessage()));
                                    cgosVar = new cgos(27000L);
                                } catch (IllegalStateException e4) {
                                    ((eluo) cgnh.a.f(cgzp.h()).s(e4)).B("GCoreEsimRegister attempt got IllegalStateException: %s", new etrz(etry.NO_USER_DATA, e4.getMessage()));
                                    cgosVar = new cgos(27013L);
                                } catch (wjw e5) {
                                    ((eluo) cgnh.a.f(cgzp.h()).s(e5)).B("GCoreEsimRegister attempt got auth exception %s.", new etrz(etry.NO_USER_DATA, e5.getMessage()));
                                    cgosVar = new cgos(27009L);
                                }
                                cgnh.a.f(cgzp.h()).B("Register new eCPID on gcm token:{%s}", c);
                            }
                        } else {
                            ((eluo) ausnVar2.j()).x("eSIM is not enabled on device.");
                            new IllegalStateException("eSIM is not enabled on device.");
                            cgosVar = new cgos();
                        }
                        final cgsl cgslVar2 = cgslVar;
                        new caqj(Looper.getMainLooper()).post(new Runnable() { // from class: cgnf
                            @Override // java.lang.Runnable
                            public final void run() {
                                ausn ausnVar3 = cgnh.a;
                                cgsl cgslVar3 = cgsl.this;
                                cgou cgouVar = cgosVar;
                                long a = cgou.a(cgouVar);
                                cgls c2 = cgls.c();
                                fhvs fhvsVar = fhvs.ESIM_CPID_REGISTER_RESPONSE;
                                final String str4 = cgslVar3.b;
                                c2.q(fhvsVar, str4, cgslVar3.c, cgslVar3.d, cgslVar3.e, a);
                                final MobileDataPlanSettingsChimeraActivity mobileDataPlanSettingsChimeraActivity = cgslVar3.a;
                                final Intent intent2 = cgslVar3.f;
                                if (!(cgouVar instanceof cgot)) {
                                    ((eluo) MobileDataPlanSettingsChimeraActivity.j.j()).B("eSIM GcoreRegister failed with session ID %s", str4);
                                    Bundle extras = intent2.getExtras();
                                    extras.putLong("ESIM_RPC_STATUS_KEY", a);
                                    mobileDataPlanSettingsChimeraActivity.k(fhvs.ESIM_CPID_REGISTER_ERROR, extras, str4);
                                    return;
                                }
                                ewlh ewlhVar = (ewlh) cgou.b(cgouVar, ewlh.class);
                                String str5 = ewlhVar.b;
                                if (ekvk.c(str5)) {
                                    new caqj(Looper.getMainLooper()).post(new Runnable() { // from class: cgsm
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            MobileDataPlanSettingsChimeraActivity.this.k(fhvs.ESIM_INIT_ERROR, intent2.getExtras(), str4);
                                        }
                                    });
                                    return;
                                }
                                String host = Uri.parse(str5).getHost();
                                ((eluo) MobileDataPlanSettingsChimeraActivity.j.h()).P("eSIM GcoreRegister success with session ID %s and URL %s", str4, host);
                                intent2.putExtra("ESIM_SESSION_ID", str4);
                                intent2.putExtra("ESIM_SERVICE_HOST", host);
                                if (ftbz.q()) {
                                    ewkz ewkzVar = ewlhVar.c;
                                    if (ewkzVar == null) {
                                        ewkzVar = ewkz.a;
                                    }
                                    fguy.m(intent2, "esim_precheck_config", ewkzVar);
                                }
                                mobileDataPlanSettingsChimeraActivity.startActivityForResult(intent2, 2335);
                            }
                        });
                    }
                });
                return false;
            }
            k(fhvs.ESIM_NOT_SUPPORTED_ERROR, addFlags.getExtras(), uuid);
            ((eluo) ausnVar.j()).x("Device does not have eSIM features enabled");
            return false;
        } catch (IllegalArgumentException e) {
            k(fhvs.ESIM_INIT_ERROR, new Bundle(), "uninitialized");
            ((eluo) ((eluo) j.j()).s(e)).B("Invalid url for eSIM: %s", data);
            return false;
        }
    }

    public final boolean r() {
        return findViewById(R.id.error_screen_flipper).getVisibility() == 0;
    }

    final void s(Intent intent) {
        fhvs fhvsVar;
        int i;
        if (intent == null) {
            return;
        }
        if (intent.getExtras() == null) {
            ((eluo) j.i()).x("Expected intent extras field is null.");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            j.f(cgzp.h()).x("handlePurchasePlanActivation did not find required action.");
            return;
        }
        if (!action.equals("com.google.android.gms.mobiledataplan.ui.PURCHASE_PLAN_ACTIVATION")) {
            j.f(cgzp.h()).B("handlePurchasePlanActivation did not find the expected action. Received: %s", action);
            return;
        }
        PurchasePlanActivation purchasePlanActivation = (PurchasePlanActivation) intent.getExtras().getParcelable("PURCHASE_PLAN_ACTIVATION");
        if (purchasePlanActivation == null) {
            j.f(cgzp.h()).x("Optional PurchasePlanAction status is not present.");
            return;
        }
        List list = cgro.a;
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((PurchasePlanActivation) list.get(size)).b.equals(purchasePlanActivation.b)) {
                list.remove(size);
                z = true;
            }
        }
        if (!z) {
            j.f(cgzp.h()).P("purchasePlanActivation is unknown. TransactionID: %s, PlanId: %s", purchasePlanActivation.a, purchasePlanActivation.b);
            return;
        }
        this.l.q(true);
        int i2 = purchasePlanActivation.c;
        if (i2 == 2) {
            fhvsVar = fhvs.PLAN_ACTIVATION_MESSAGE_RECEIVED_SUCCESS;
            i = 84;
        } else if (i2 != 3) {
            j.f(cgzp.h()).T("purchasePlanActivation updated, but has an unexpected state. TransactionID: %s, PlanId: %s, state: %s", purchasePlanActivation.a, purchasePlanActivation.b, Integer.valueOf(purchasePlanActivation.c));
            return;
        } else {
            fhvsVar = fhvs.PLAN_ACTIVATION_MESSAGE_RECEIVED_FAILURE;
            i = 85;
        }
        cgls.c().Q(i, "refresh_button", "R.id.refresh", fhvsVar, System.currentTimeMillis(), cgtm.a());
    }
}
