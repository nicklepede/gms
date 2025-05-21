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
import defpackage.aqxd;
import defpackage.aqxe;
import defpackage.aqxo;
import defpackage.asej;
import defpackage.asmf;
import defpackage.asot;
import defpackage.bahh;
import defpackage.bajh;
import defpackage.bp;
import defpackage.bxek;
import defpackage.bzfh;
import defpackage.ceau;
import defpackage.ceay;
import defpackage.cecl;
import defpackage.cecs;
import defpackage.ceea;
import defpackage.cefr;
import defpackage.cegz;
import defpackage.ceig;
import defpackage.ceih;
import defpackage.ceje;
import defpackage.cejh;
import defpackage.cejj;
import defpackage.cekc;
import defpackage.cekd;
import defpackage.cekf;
import defpackage.celj;
import defpackage.ceqf;
import defpackage.ceqi;
import defpackage.ejhf;
import defpackage.elgy;
import defpackage.elgz;
import defpackage.etuw;
import defpackage.fecj;
import defpackage.ffgu;
import defpackage.fqfy;
import defpackage.fqgn;
import defpackage.fqgy;
import defpackage.fqhb;
import defpackage.fqhf;
import defpackage.fqhv;
import defpackage.fqih;
import defpackage.fqip;
import defpackage.ig;
import defpackage.qet;
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

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MobileDataPlanSettingsChimeraActivity extends qet {
    public static final asot j = asot.b("MobileDataPlan", asej.MOBILE_DATA_PLAN);
    private static boolean n = false;
    public float k;
    public ceih l;
    public boolean m;
    private boolean o = false;
    private final int p = R.layout.settings_activity;
    private cekd q = null;
    private boolean r = false;

    public static etuw a(Context context) {
        fecj v = etuw.a.v();
        String e = ceqi.e(context.getApplicationContext());
        if (!v.b.L()) {
            v.U();
        }
        etuw etuwVar = (etuw) v.b;
        e.getClass();
        etuwVar.c = e;
        String string = context.getString(R.string.support_page_error_message);
        if (!v.b.L()) {
            v.U();
        }
        etuw etuwVar2 = (etuw) v.b;
        string.getClass();
        etuwVar2.b = string;
        return (etuw) v.Q();
    }

    private final void t(Intent intent) {
        Optional empty;
        if (fqih.j()) {
            if (intent == null) {
                empty = Optional.empty();
            } else if (intent.getExtras() == null) {
                ((ejhf) j.i()).x("Expected intent extras field is null.");
                empty = Optional.empty();
            } else if (intent.getExtras().containsKey("NOTIFICATION_LOGGING_CAMPAIGN_ID")) {
                String string = intent.getExtras().getString("NOTIFICATION_LOGGING_CAMPAIGN_ID");
                empty = TextUtils.isEmpty(string) ? Optional.empty() : Optional.of(string);
            } else {
                empty = Optional.empty();
            }
            if (empty.isPresent()) {
                j.f(ceqi.h()).B("ChimeraActivity sets campaignId: %s", empty.get());
                this.l.r((String) empty.get());
            }
        }
    }

    private static final boolean u(etuw etuwVar) {
        if (etuwVar != null) {
            return (etuwVar.b.isEmpty() && etuwVar.d.size() == 0) ? false : true;
        }
        return false;
    }

    public final void k(ffgu ffguVar, Bundle bundle, String str) {
        cegz.z(this, bundle, R.id.carrier_support_page_placeholder, ffguVar, str);
        findViewById(R.id.content_layout).setVisibility(8);
    }

    public final void l() {
        cecl.c().Q(26, this.q.toString(), "R.id.error_layout", ffgu.ERROR_PAGE_HIDDEN, System.currentTimeMillis(), cekf.a());
        findViewById(R.id.error_screen_flipper).setVisibility(8);
        findViewById(R.id.content_layout).setVisibility(0);
    }

    public final void m() {
        findViewById(R.id.user_notice_card).setVisibility(8);
    }

    final void n(boolean z, boolean z2) {
        ffgu ffguVar;
        cecl c = cecl.c();
        Intent intent = getIntent();
        String action = intent == null ? null : intent.getAction();
        if (!z && !z2) {
            if (fqhb.e() && this.m) {
                return;
            }
            c.Q(40, null, null, ffgu.REENTER_MDP_UI_VIA_APP_PICKER, System.currentTimeMillis(), cekf.a());
            return;
        }
        if (action != null) {
            if (action.equals("com.google.android.gms.mobiledataplan.NOTIFICATION_TO_ACTIVITY")) {
                int b = elgz.b(intent.getIntExtra("NOTIFICATION_LOGGING_NOTIFICATION_TYPE", 0));
                if (b == 0) {
                    throw null;
                }
                int i = b - 2;
                if (i != 100) {
                    switch (i) {
                        case 1:
                            ffguVar = ffgu.PLAN_STATUS_JUMP_TO_UI;
                            break;
                        case 2:
                            ffguVar = ffgu.UPSELL_OFFER_JUMP_TO_UI;
                            break;
                        case 3:
                            if (!fqhv.f()) {
                                ffguVar = ffgu.WELCOME_JUMP_TO_UI;
                                break;
                            } else {
                                ffguVar = ffgu.ACCOUNT_ALERT_JUMP_TO_UI;
                                break;
                            }
                        case 4:
                            ffguVar = ffgu.OUT_OF_DATA_JUMP_TO_UI;
                            break;
                        case 5:
                            ffguVar = ffgu.EXPIRATION_REMINDER_JUMP_TO_UI;
                            break;
                        case 6:
                            ffguVar = ffgu.ACCOUNT_BALANCE_JUMP_TO_UI;
                            break;
                        case 7:
                            ffguVar = ffgu.PURCHASE_JUMP_TO_UI;
                            break;
                        case 8:
                            ffguVar = ffgu.WELCOME_JUMP_TO_UI;
                            break;
                        case 9:
                            ffguVar = ffgu.DAILY_UPDATE_JUMP_TO_UI;
                            break;
                        case 10:
                            ffguVar = ffgu.PAYGO_JUMP_TO_UI;
                            break;
                        default:
                            ffguVar = ffgu.UNSPECIFIED_EVENT_CODE;
                            break;
                    }
                } else {
                    ffguVar = ffgu.OTHER_JUMP_TO_UI;
                }
                if (z) {
                    if (intent.getIntExtra("NOTIFICATION_ACTION_INDEX", -1) != -1) {
                        c.z(intent, elgy.NOTIFICATION_ACTION_TAKEN, "MDP_UiAction", ffgu.NOTIFICATION_ACTION_TAKEN);
                    }
                    c.z(intent, elgy.JUMP_TO_UI, "MDP_UiAction", ffguVar);
                }
                long longExtra = intent.getLongExtra("NOTIFICATION_LOGGING_NOTIFICATION_ID", 0L);
                c.P(true != z ? 41 : 17, Long.toString(longExtra), Long.toString(longExtra), Long.valueOf(longExtra), z ? ffgu.ENTER_MDP_UI_VIA_NOTIFICATION : ffgu.REENTER_MDP_UI_VIA_NOTIFICATION, System.currentTimeMillis(), cekf.a());
                return;
            }
            if (action.equals("com.google.android.gms.mobiledataplan.ui.SETTING_TO_ACTIVITY")) {
                c.Q(16, null, null, ffgu.ENTER_MDP_UI_VIA_MENU, System.currentTimeMillis(), cekf.a());
                return;
            } else if (action.equals("com.google.android.gms.mobiledataplan.ui.DETAIL_SETTINGS_TO_MAIN")) {
                c.Q(73, null, null, ffgu.ENTER_MDP_UI_VIA_SETTINGS, System.currentTimeMillis(), cekf.a());
            }
        }
        Uri referrer = getReferrer();
        c.Q(true != z ? 42 : 18, referrer != null ? referrer.toString() : "Unknown Calling Package", null, z ? ffgu.ENTER_MDP_UI_VIA_DEEP_LINK : ffgu.REENTER_MDP_UI_VIA_DEEP_LINK, System.currentTimeMillis(), cekf.a());
    }

    public final void o(cekd cekdVar) {
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
        this.q = cekdVar;
        viewFlipper.setVisibility(0);
        this.l.t(false);
        celj.a();
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
        textView4.setText(getString(cekdVar.g, new Object[]{g}));
        if (fqih.m() && cekdVar == cekd.UNSUPPORTED && g != null && Build.VERSION.SDK_INT >= 29) {
            try {
                if (Duration.ofMillis(System.currentTimeMillis()).toSeconds() >= bxek.a(AppContextProvider.a(), "mobiledataplan", "ESIM_SHARED_PREFS", 0).b("ESIM_LAST_SUCCESS_TIMESTAMP", 0L) + 86400) {
                    ((ejhf) j.h()).B("Pending valid data plan response for eSIM subscriber of carrier: %s", g);
                } else {
                    boolean anyMatch = Collection.EL.stream(SubscriptionManager.from(this).getActiveSubscriptionInfoList()).anyMatch(new Predicate() { // from class: cejd
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo463negate() {
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
                            asot asotVar = MobileDataPlanSettingsChimeraActivity.j;
                            isEmbedded = subscriptionInfo.isEmbedded();
                            if (isEmbedded) {
                                return Objects.equals(subscriptionInfo.getCarrierName().toString(), g);
                            }
                            return false;
                        }
                    });
                    asot asotVar = j;
                    ((ejhf) asotVar.h()).Q("eSIM subscriber of valid carrier %s: %s", g, anyMatch);
                    if (anyMatch) {
                        ((ejhf) asotVar.j()).B("Unsupported plan error with eSIM carrier: %s", g);
                        textView4.setText(getString(R.string.esim_post_activation_message, new Object[]{g}));
                        imageView4.setImageResource(R.drawable.check_circle);
                    }
                }
            } catch (IOException e) {
                ((ejhf) ((ejhf) j.j()).s(e)).x("KeyValuePreferences failed to fetch eSIM status.");
            }
        }
        if (cekdVar != cekd.OPTED_OUT) {
            int i = cekdVar.h;
            if (i == 0) {
                textView3.setVisibility(8);
            } else {
                textView3.setVisibility(0);
                if (TextUtils.isEmpty(g) && fqip.a.a().d()) {
                    textView3.setText(cekdVar.k);
                } else {
                    textView3.setText(getString(i, new Object[]{g}));
                }
            }
            imageView4.setVisibility(true != cekdVar.l ? 8 : 0);
            imageView3.setVisibility(8);
            int i2 = cekdVar.i;
            if (i2 == 0) {
                button2.setVisibility(8);
            } else {
                button2.setVisibility(0);
                button2.setText(i2);
                button2.setOnClickListener(new ceig(this.l));
            }
            m();
            cecl.c().Q(43, "handledError", null, ffgu.FINISH_UI_AFTER_USER_TRIGGER, System.currentTimeMillis(), cekf.a());
            return;
        }
        if (fqih.v()) {
            textView4.setText(getString(R.string.t_mobile_opted_out_title));
            Object g2 = fqgn.g();
            Object h = fqgn.h();
            Object f = fqgn.f();
            fqgn fqgnVar = fqgn.a;
            textView3.setText(Html.fromHtml(getString(R.string.t_mobile_opted_out_text, new Object[]{g, g2, h, f, fqgnVar.a().h(), fqgnVar.a().g()})));
        } else {
            textView3.setText(Html.fromHtml(getString(cekdVar.h, new Object[]{g, fqgn.g(), fqgn.h(), fqgn.f()})));
        }
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
        button2.setVisibility(0);
        button2.setText(cekdVar.i);
        button2.setOnClickListener(new cejj(this.l));
        ceau c = ceau.c();
        MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse = this.l.q;
        Bitmap bitmap = null;
        Long valueOf = mdpCarrierPlanIdResponse != null ? Long.valueOf(mdpCarrierPlanIdResponse.e) : null;
        if (valueOf == null) {
            valueOf = ceau.c().p(ceqf.g(AppContextProvider.a()));
        }
        ceay a = c.d.a(valueOf);
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
        cecl.c().Q(69, null, "R.id.error_layout", ffgu.OPT_OUT_PAGE_SHOWN, System.currentTimeMillis(), cekf.a());
        cecl.c().Q(43, "handledError", null, ffgu.FINISH_UI_AFTER_USER_TRIGGER, System.currentTimeMillis(), cekf.a());
    }

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
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
            cekc.c(this.l, true);
        } else {
            cekc.c(this.l, false);
            p(new aqxe(new Status(27023)));
        }
    }

    @Override // defpackage.qet, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onConfigurationChanged(Configuration configuration) {
        boolean isInMultiWindowMode;
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT > 24 && !r()) {
            isInMultiWindowMode = getContainerActivity().isInMultiWindowMode();
            if (isInMultiWindowMode) {
                if (fqip.a.a().h()) {
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
        ceih ceihVar = this.l;
        if (ceihVar.f == null) {
            return;
        }
        ceihVar.m.o();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        ceih ceihVar;
        Activity containerActivity;
        super.onCreate(bundle);
        setTitle(R.string.mobile_data_plan);
        setContentView(this.p);
        ig hy = hy();
        hy.q(4, 4);
        hy.o(true);
        if (Build.VERSION.SDK_INT > 25) {
            if (fqip.j()) {
                hy.j(new ColorDrawable(getResources().getColor(R.color.carrier_header_background)));
            } else {
                hy.j(new ColorDrawable(getResources().getColor(R.color.top_entry_grey)));
            }
        }
        this.k = hy.a();
        hy.t(0.0f);
        if (fqih.m() && !this.r) {
            setTheme(R.style.Theme_MobileDataPlan_DefaultGoogleMaterial);
            boolean q = q(getIntent());
            this.r = !q;
            if (!q) {
                return;
            }
        }
        if (!fqhf.S()) {
            ((ejhf) j.j()).x("Mobiledataplan's Settings is not enabled in this device yet.");
            finish();
            return;
        }
        if (ceqi.i(this)) {
            finish();
            return;
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.dataplan_recyclerview);
        recyclerView.aj(new LinearLayoutManager());
        recyclerView.z(new cejh(this, hy));
        this.m = false;
        n = false;
        if (fqip.g()) {
            try {
                ceih.d();
                ((ejhf) j.h()).x("GlobalStateHelper was NOT null, calling destroyInstance() first to create new GlobalStateHelper.");
                ceih.l();
            } catch (IllegalStateException unused) {
            }
        }
        cekf.b();
        synchronized (ceih.c) {
            ceih ceihVar2 = ceih.d;
            if (ceihVar2 != null) {
                throw new IllegalStateException("createInstance called when instance != null! Instance: " + ceihVar2.toString());
            }
            ceih.d = new ceih(this);
            ceihVar = ceih.d;
        }
        this.l = ceihVar;
        t(getIntent());
        n(true, this.o);
        if (fqih.w()) {
            s(getIntent());
        }
        if (!fqgy.a.a().b() || (containerActivity = getContainerActivity()) == null) {
            return;
        }
        asej asejVar = asej.MOBILE_DATA_PLAN;
        fqgy fqgyVar = fqgy.a;
        bzfh.a(containerActivity, asejVar, fqgyVar.a().a(), fqgyVar.a().c());
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onCreateOptionsMenu(Menu menu) {
        if (findViewById(R.id.support_channel_page_layout) != null) {
            return false;
        }
        getMenuInflater().inflate(R.menu.mobiledataplan_settings_menu, menu);
        return true;
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        if (this.l != null && (!fqip.g() || this.l == ceih.d())) {
            cecl.c().Q(37, null, null, ffgu.TERMINATE_MDP_UI, System.currentTimeMillis(), cekf.a());
            ceih.l();
            cekf.a = null;
        }
        fqfy.a.a().k();
        super.onDestroy();
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.o = true;
        setIntent(intent);
        if (fqih.m()) {
            boolean q = q(intent);
            this.r = !q;
            if (!q) {
                return;
            }
        }
        if (fqih.w()) {
            s(intent);
        }
        t(intent);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        }
        Bitmap bitmap = null;
        if (itemId == R.id.feedback) {
            aqxd aqxdVar = bahh.a;
            aqxo aqxoVar = new aqxo((Context) this, (int[][]) null);
            try {
                View rootView = getWindow().getDecorView().getRootView();
                Bitmap createBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.RGB_565);
                rootView.draw(new Canvas(createBitmap));
                bitmap = createBitmap;
            } catch (IllegalArgumentException e) {
                ((ejhf) ((ejhf) j.j()).s(e)).x("MobileDataPlan feedback got screenshot failed!");
            }
            bajh bajhVar = new bajh(this);
            bajhVar.a = bitmap;
            bajhVar.e = "com.google.android.gms.mobiledataplan.USER_INITIATED_FEEDBACK_REPORT";
            MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse = this.l.q;
            if (mdpCarrierPlanIdResponse == null) {
                aqxoVar.aa(bajhVar.a());
            } else {
                bajhVar.c("carrier ID", Long.toString(mdpCarrierPlanIdResponse.e));
                String str = mdpCarrierPlanIdResponse.a;
                if (!TextUtils.isEmpty(str)) {
                    bajhVar.c("CPID", str);
                }
                aqxoVar.aa(bajhVar.a());
            }
            return true;
        }
        if (itemId == R.id.refresh) {
            cecl.c().Q(13, "refresh_button", "R.id.refresh", ffgu.REFRESH_DATA_PLAN, System.currentTimeMillis(), cekf.a());
            this.l.q(false);
            return true;
        }
        if (itemId == R.id.stop_syncing) {
            new AlertDialog.Builder(this).setTitle(R.string.stop_syncing_confirm_dialog_title).setMessage(getString(R.string.stop_syncing_confirm_dialog_message, new Object[]{this.l.g()})).setPositiveButton(R.string.stop_syncing_confirm_dialog_positive_button, new DialogInterface.OnClickListener() { // from class: cejc
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    cecl.c().Q(31, null, null, ffgu.CLICK_STOP_SYNCING_PLAN, System.currentTimeMillis(), cekf.a());
                    MobileDataPlanSettingsChimeraActivity mobileDataPlanSettingsChimeraActivity = MobileDataPlanSettingsChimeraActivity.this;
                    if (fqhf.C()) {
                        cekc.c(mobileDataPlanSettingsChimeraActivity.l, false);
                    }
                    mobileDataPlanSettingsChimeraActivity.p(new aqxe(new Status(27023)));
                }
            }).setNegativeButton(R.string.common_cancel, (DialogInterface.OnClickListener) null).create().show();
            return true;
        }
        if (itemId != R.id.support) {
            if (itemId != R.id.settings) {
                return super.onOptionsItemSelected(menuItem);
            }
            Intent className = new Intent("com.google.android.gms.mobiledataplan.ui.SETTINGS").setClassName(this, "com.google.android.gms.mobiledataplan.ui.MobileDataPlanDetailActivity");
            if (fqhb.e() && cekf.a() != null) {
                className.putExtra("EventFlowId", cekf.a());
            }
            className.putExtra("ComeFrom", "com.google.android.gms/com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsActivity");
            startActivityForResult(className, 2334);
            return true;
        }
        cecl.c().Q(33, menuItem.getTitle().toString(), "R.id.support", ffgu.CLICK_CARRIER_SUPPORT, System.currentTimeMillis(), cekf.a());
        etuw e2 = ceau.c().e(ceqf.g(getApplicationContext()));
        if (!u(e2)) {
            ((ejhf) j.j()).x("Trying to launch support page when there is no support object!");
            e2 = a(this);
        }
        bp bpVar = new bp(getSupportFragmentManager());
        cefr cefrVar = new cefr();
        cefrVar.a = e2;
        bpVar.F(R.id.carrier_support_page_placeholder, cefrVar);
        bpVar.j = FragmentTransaction.TRANSIT_FRAGMENT_FADE;
        bpVar.w(null);
        bpVar.a();
        getSupportFragmentManager().an();
        findViewById(R.id.content_layout).setVisibility(8);
        setTitle(getString(R.string.support_menu_item, new Object[]{this.l.g()}));
        invalidateOptionsMenu();
        return true;
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onPause() {
        super.onPause();
        if (this.r) {
            j.f(ceqi.h()).x("Skipping onPause after eSIM started.");
            return;
        }
        if (!fqhb.e() || !this.m) {
            cecl.c().Q(15, null, null, ffgu.EXIT_MDP_UI, System.currentTimeMillis(), cekf.a());
        }
        this.l.B = false;
        if (this.m) {
            return;
        }
        n = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00af, code lost:
    
        if (r5 == defpackage.ffgs.OPT_IN) goto L37;
     */
    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
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
            asot r9 = com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsChimeraActivity.j
            java.util.logging.Level r0 = defpackage.ceqi.h()
            ejhf r9 = r9.f(r0)
            java.lang.String r0 = "Skipping onPrepareOptionsMenu after eSIM started."
            r9.x(r0)
            return r1
        L15:
            android.content.Context r0 = r8.getApplicationContext()
            java.lang.String r0 = defpackage.ceqf.g(r0)
            r8.r()
            ceau r2 = defpackage.ceau.c()
            r2.F(r0)
            defpackage.fqgb.g()
            ceau r2 = defpackage.ceau.c()
            r2.e(r0)
            ceih r2 = r8.l
            r2.g()
            r2 = r1
        L37:
            int r3 = r9.size()
            r4 = 1
            if (r2 >= r3) goto Lf1
            android.view.MenuItem r3 = r9.getItem(r2)
            java.lang.CharSequence r5 = r3.getTitle()
            r6 = 2132091512(0x7f152278, float:1.9823394E38)
            java.lang.String r6 = r8.getString(r6)
            if (r5 != r6) goto L72
            boolean r5 = r8.r()
            if (r5 != 0) goto L6c
            ceau r5 = defpackage.ceau.c()
            boolean r5 = r5.F(r0)
            if (r5 == 0) goto L6c
            boolean r5 = defpackage.fqhf.C()
            if (r5 == 0) goto L6c
            boolean r5 = defpackage.ceau.u()
            if (r5 != 0) goto L6c
            goto L6d
        L6c:
            r4 = r1
        L6d:
            r3.setVisible(r4)
            goto Led
        L72:
            java.lang.CharSequence r5 = r3.getTitle()
            r6 = 2132091581(0x7f1522bd, float:1.9823534E38)
            java.lang.String r7 = r8.getString(r6)
            if (r5 != r7) goto Led
            boolean r5 = r8.r()
            if (r5 != 0) goto Lea
            ceau r5 = defpackage.ceau.c()
            boolean r5 = r5.F(r0)
            if (r5 != 0) goto Lb1
            ceau r5 = defpackage.ceau.c()
            boolean r7 = defpackage.ceau.u()
            if (r7 == 0) goto Lea
            fehc r7 = r5.l()
            if (r7 == 0) goto Lea
            fehc r5 = r5.l()
            int r5 = r5.g
            ffgs r5 = defpackage.ffgs.b(r5)
            if (r5 != 0) goto Lad
            ffgs r5 = defpackage.ffgs.UNRECOGNIZED
        Lad:
            ffgs r7 = defpackage.ffgs.OPT_IN
            if (r5 != r7) goto Lea
        Lb1:
            boolean r5 = defpackage.fqgb.g()
            if (r5 == 0) goto Lea
            ceau r5 = defpackage.ceau.c()
            etuw r5 = r5.e(r0)
            boolean r5 = u(r5)
            if (r5 == 0) goto Lea
            ceih r5 = r8.l
            java.lang.String r5 = r5.g()
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto Lea
            r3.setVisible(r4)
            java.lang.String r5 = r8.getString(r6)
            ceih r6 = r8.l
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

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onRestart() {
        super.onRestart();
        if (this.r) {
            j.f(ceqi.h()).x("Recreating activity in onRestart after eSIM started.");
            recreate();
            return;
        }
        if (n && fqhb.m()) {
            cekf.b();
            n = false;
        }
        n(false, this.o);
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        super.onResume();
        if (this.r) {
            j.f(ceqi.h()).x("Skipping onResume after eSIM started.");
            return;
        }
        if (n && fqhb.m()) {
            cekf.b();
            n = false;
        }
        this.l.B = true;
        this.o = false;
        new cecs().m();
        if (!this.m && !r()) {
            this.l.q(findViewById(R.id.progress_loader).getVisibility() == 0);
        }
        this.m = false;
    }

    public final void p(Exception exc) {
        cecl.c().Q(14, null, null, ffgu.REFRESH_FAILED, System.currentTimeMillis(), cekf.a());
        cekd a = cekd.a(exc);
        ((ejhf) j.f(ceqi.h()).s(exc)).B("Showing error page for error message %s", a);
        cecl.c().Q(25, a.toString(), "R.id.error_layout", ffgu.ERROR_PAGE_SHOWN, System.currentTimeMillis(), cekf.a());
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
        asot asotVar = j;
        ((ejhf) asotVar.h()).B("uri %s", action);
        if (data == null) {
            ((ejhf) asotVar.j()).x("No URI passed in through deeplink intent");
            return true;
        }
        List<String> pathSegments = data.getPathSegments();
        if (pathSegments.size() != 2) {
            ((ejhf) asotVar.h()).B("eSIM single path segment: %s", pathSegments.get(0));
            return true;
        }
        String str = pathSegments.get(0);
        ((ejhf) asotVar.h()).B("eSIM subpath segment : %s", str);
        if (!str.equals("esim")) {
            return true;
        }
        try {
            long parseLong = Long.parseLong(pathSegments.get(1));
            Long valueOf = Long.valueOf(parseLong);
            fqih fqihVar = fqih.a;
            if (!fqihVar.a().b().b.contains(valueOf)) {
                throw new IllegalArgumentException("Invalid carrier id passed into eSIM flow");
            }
            ((ejhf) asotVar.h()).B("eSIM flow launched with carrier: %d", valueOf);
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
                urlQuerySanitizer.registerParameters((String[]) Collection.EL.stream(fqihVar.a().c().b).toArray(new IntFunction() { // from class: cejg
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i) {
                        asot asotVar2 = MobileDataPlanSettingsChimeraActivity.j;
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
                if (fqih.r()) {
                    empty = Optional.ofNullable(bundle.getString("plan_segment_id"));
                    empty2 = Optional.ofNullable(bundle.getString("plan_subsegment_id"));
                }
            }
            Optional optional = empty;
            Optional optional2 = empty2;
            cecl.c().r(ffgu.ESIM_FLOW_STARTED, uuid, optional, optional2, parseLong);
            if (Build.VERSION.SDK_INT >= 29 && fqih.m()) {
                Long valueOf2 = Long.valueOf(parseLong);
                if (uuid == null) {
                    throw new IllegalArgumentException("Gcore eSIM Registration arguments are not set properly");
                }
                valueOf2.getClass();
                final ceea ceeaVar = new ceea(this, parseLong, uuid);
                cecl.c().q(ffgu.ESIM_CPID_REGISTER_REQUEST, uuid, optional, optional2, parseLong, 0L);
                final ceje cejeVar = new ceje(this, uuid, optional, optional2, parseLong, addFlags);
                new asmf(1, 9).execute(new Runnable() { // from class: cedz
                    @Override // java.lang.Runnable
                    public final void run() {
                        final cefn ceflVar;
                        asot asotVar2 = ceea.a;
                        ejhf f = asotVar2.f(ceqi.h());
                        ceea ceeaVar2 = ceea.this;
                        long j2 = ceeaVar2.d;
                        Long valueOf3 = Long.valueOf(j2);
                        Boolean valueOf4 = Boolean.valueOf(fqhf.G());
                        String str3 = ceeaVar2.e;
                        f.T("Exec GcoreEsimRegister. req: <%s, %s> gcm:%b", valueOf3, str3, valueOf4);
                        if (fqih.m()) {
                            Context context = ceeaVar2.b;
                            String c = cecb.a().c(context);
                            ((ejhf) asotVar2.h()).B("eSIM started with GCM token: %s", c);
                            if (TextUtils.isEmpty(c)) {
                                ((ejhf) asotVar2.j()).x("Unable to get a GCM token for eSIM.");
                                new IllegalStateException("Unable to get a GCM token.");
                                ceflVar = new cefl();
                            } else {
                                cedb cedbVar = new cedb(context, fqhf.u(), ceeaVar2.c, (int) fqhf.f());
                                try {
                                    etvp e = fqhs.f() ? cedbVar.e(c, j2, str3, bxut.b) : cedbVar.e(c, j2, str3, null);
                                    if (e == null) {
                                        ((ejhf) asotVar2.j()).x("Got null response when attempting GcoreEsimRegister");
                                        new IllegalStateException("Got null response.");
                                        ceflVar = new cefl();
                                    } else {
                                        ceflVar = new cefm(e);
                                    }
                                } catch (ftye e2) {
                                    ((ejhf) ceea.a.f(ceqi.h()).s(e2)).B("GCoreEsimRegister attempt got StatusException: %s", new erdd(erdc.NO_USER_DATA, cecu.a(e2).j));
                                    ceflVar = new cefl(cecu.a(e2).i);
                                } catch (IllegalArgumentException e3) {
                                    ((ejhf) ceea.a.f(ceqi.h()).s(e3)).B("GCoreEsimRegister attempt with invalid parameter(s): %s", new erdd(erdc.NO_USER_DATA, e3.getMessage()));
                                    ceflVar = new cefl(27000L);
                                } catch (IllegalStateException e4) {
                                    ((ejhf) ceea.a.f(ceqi.h()).s(e4)).B("GCoreEsimRegister attempt got IllegalStateException: %s", new erdd(erdc.NO_USER_DATA, e4.getMessage()));
                                    ceflVar = new cefl(27013L);
                                } catch (unx e5) {
                                    ((ejhf) ceea.a.f(ceqi.h()).s(e5)).B("GCoreEsimRegister attempt got auth exception %s.", new erdd(erdc.NO_USER_DATA, e5.getMessage()));
                                    ceflVar = new cefl(27009L);
                                }
                                ceea.a.f(ceqi.h()).B("Register new eCPID on gcm token:{%s}", c);
                            }
                        } else {
                            ((ejhf) asotVar2.j()).x("eSIM is not enabled on device.");
                            new IllegalStateException("eSIM is not enabled on device.");
                            ceflVar = new cefl();
                        }
                        final ceje cejeVar2 = cejeVar;
                        new byhr(Looper.getMainLooper()).post(new Runnable() { // from class: cedy
                            @Override // java.lang.Runnable
                            public final void run() {
                                asot asotVar3 = ceea.a;
                                ceje cejeVar3 = ceje.this;
                                cefn cefnVar = ceflVar;
                                long a = cefn.a(cefnVar);
                                cecl c2 = cecl.c();
                                ffgu ffguVar = ffgu.ESIM_CPID_REGISTER_RESPONSE;
                                final String str4 = cejeVar3.b;
                                c2.q(ffguVar, str4, cejeVar3.c, cejeVar3.d, cejeVar3.e, a);
                                final MobileDataPlanSettingsChimeraActivity mobileDataPlanSettingsChimeraActivity = cejeVar3.a;
                                final Intent intent2 = cejeVar3.f;
                                if (!(cefnVar instanceof cefm)) {
                                    ((ejhf) MobileDataPlanSettingsChimeraActivity.j.j()).B("eSIM GcoreRegister failed with session ID %s", str4);
                                    Bundle extras = intent2.getExtras();
                                    extras.putLong("ESIM_RPC_STATUS_KEY", a);
                                    mobileDataPlanSettingsChimeraActivity.k(ffgu.ESIM_CPID_REGISTER_ERROR, extras, str4);
                                    return;
                                }
                                etvp etvpVar = (etvp) cefn.b(cefnVar, etvp.class);
                                String str5 = etvpVar.b;
                                if (eiif.c(str5)) {
                                    new byhr(Looper.getMainLooper()).post(new Runnable() { // from class: cejf
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            MobileDataPlanSettingsChimeraActivity.this.k(ffgu.ESIM_INIT_ERROR, intent2.getExtras(), str4);
                                        }
                                    });
                                    return;
                                }
                                String host = Uri.parse(str5).getHost();
                                ((ejhf) MobileDataPlanSettingsChimeraActivity.j.h()).P("eSIM GcoreRegister success with session ID %s and URL %s", str4, host);
                                intent2.putExtra("ESIM_SESSION_ID", str4);
                                intent2.putExtra("ESIM_SERVICE_HOST", host);
                                if (fqih.q()) {
                                    etvh etvhVar = etvpVar.c;
                                    if (etvhVar == null) {
                                        etvhVar = etvh.a;
                                    }
                                    fegf.m(intent2, "esim_precheck_config", etvhVar);
                                }
                                mobileDataPlanSettingsChimeraActivity.startActivityForResult(intent2, 2335);
                            }
                        });
                    }
                });
                return false;
            }
            k(ffgu.ESIM_NOT_SUPPORTED_ERROR, addFlags.getExtras(), uuid);
            ((ejhf) asotVar.j()).x("Device does not have eSIM features enabled");
            return false;
        } catch (IllegalArgumentException e) {
            k(ffgu.ESIM_INIT_ERROR, new Bundle(), "uninitialized");
            ((ejhf) ((ejhf) j.j()).s(e)).B("Invalid url for eSIM: %s", data);
            return false;
        }
    }

    public final boolean r() {
        return findViewById(R.id.error_screen_flipper).getVisibility() == 0;
    }

    final void s(Intent intent) {
        ffgu ffguVar;
        int i;
        if (intent == null) {
            return;
        }
        if (intent.getExtras() == null) {
            ((ejhf) j.i()).x("Expected intent extras field is null.");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            j.f(ceqi.h()).x("handlePurchasePlanActivation did not find required action.");
            return;
        }
        if (!action.equals("com.google.android.gms.mobiledataplan.ui.PURCHASE_PLAN_ACTIVATION")) {
            j.f(ceqi.h()).B("handlePurchasePlanActivation did not find the expected action. Received: %s", action);
            return;
        }
        PurchasePlanActivation purchasePlanActivation = (PurchasePlanActivation) intent.getExtras().getParcelable("PURCHASE_PLAN_ACTIVATION");
        if (purchasePlanActivation == null) {
            j.f(ceqi.h()).x("Optional PurchasePlanAction status is not present.");
            return;
        }
        List list = ceih.a;
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((PurchasePlanActivation) list.get(size)).b.equals(purchasePlanActivation.b)) {
                list.remove(size);
                z = true;
            }
        }
        if (!z) {
            j.f(ceqi.h()).P("purchasePlanActivation is unknown. TransactionID: %s, PlanId: %s", purchasePlanActivation.a, purchasePlanActivation.b);
            return;
        }
        this.l.q(true);
        int i2 = purchasePlanActivation.c;
        if (i2 == 2) {
            ffguVar = ffgu.PLAN_ACTIVATION_MESSAGE_RECEIVED_SUCCESS;
            i = 84;
        } else if (i2 != 3) {
            j.f(ceqi.h()).T("purchasePlanActivation updated, but has an unexpected state. TransactionID: %s, PlanId: %s, state: %s", purchasePlanActivation.a, purchasePlanActivation.b, Integer.valueOf(purchasePlanActivation.c));
            return;
        } else {
            ffguVar = ffgu.PLAN_ACTIVATION_MESSAGE_RECEIVED_FAILURE;
            i = 85;
        }
        cecl.c().Q(i, "refresh_button", "R.id.refresh", ffguVar, System.currentTimeMillis(), cekf.a());
    }
}
